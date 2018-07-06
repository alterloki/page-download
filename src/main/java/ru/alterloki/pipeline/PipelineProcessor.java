package ru.alterloki.pipeline;

import org.springframework.stereotype.Component;
import ru.alterloki.pipeline.Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PipelineProcessor {

    private Map<ActionType, ActionFactory> factories = new HashMap<>();

    public void process(List<Action> actions) {
        for (Action action : actions) {

        }
    }
}
