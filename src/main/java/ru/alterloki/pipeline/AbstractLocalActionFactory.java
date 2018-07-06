package ru.alterloki.pipeline;

public abstract class AbstractLocalActionFactory implements ActionFactory {

    private MainActionFactory mainActionFactory;

    public MainActionFactory getMainActionFactory() {
        return mainActionFactory;
    }

    public void setMainActionFactory(MainActionFactory mainActionFactory) {
        this.mainActionFactory = mainActionFactory;
    }
}
