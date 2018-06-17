package ru.alterloki.pipeline;

public class Action {

    private final ActionType actionType;

    public Action(ActionType actionType) {
        this.actionType = actionType;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setParam(String name, String value) {

    }
}
