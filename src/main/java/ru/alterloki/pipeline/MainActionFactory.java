package ru.alterloki.pipeline;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Qualifier("mainActionFactory")
public class MainActionFactory implements ActionFactory {

    private Map<ActionType, ActionFactory> factories = new HashMap<>();

    public void setFactory(ActionType type, ActionFactory actionFactory) {
        factories.put(type, actionFactory);
    }

    @Override
    public Action createAction(ActionMetaInfo actionMetaInfo) {
        return factories.get(actionMetaInfo.getActionType()).createAction(actionMetaInfo);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.MAIN;
    }

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        Map<String, AbstractLocalActionFactory> localContexts = event.getApplicationContext().getBeansOfType(AbstractLocalActionFactory.class);
        for (AbstractLocalActionFactory abstractLocalActionFactory : localContexts.values()) {
            abstractLocalActionFactory.setMainActionFactory(this);
            setFactory(abstractLocalActionFactory.getActionType(), abstractLocalActionFactory);
        }
    }
}
