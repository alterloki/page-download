package ru.alterloki.pipeline;

public abstract class Action {

    private final ActionType actionType;

    public Action(ActionType actionType) {
        this.actionType = actionType;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public abstract void act();
}
