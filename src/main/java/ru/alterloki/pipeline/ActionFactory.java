package ru.alterloki.pipeline;

public interface ActionFactory {

    Action createAction(ActionMetaInfo actionMetaInfo);

    ActionType getActionType();
}
