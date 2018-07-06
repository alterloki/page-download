package ru.alterloki.pipeline;

import java.util.HashMap;
import java.util.Map;

public class ActionMetaInfo {

    private ActionType actionType;
    private Map<String, String> params = new HashMap<>();

    public ActionMetaInfo(ActionType actionType) {
        this.actionType = actionType;
    }

    public void setParam(String name, String value) {
        params.put(name, value);
    }

    public void removeParam(String name) {
        params.remove(name);
    }

    public ActionType getActionType() {
        return actionType;
    }
}
