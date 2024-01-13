package com.basicstrong.designpatterns.behavioural.command;

public class StartACCommand implements ICommandAC {
    private AC ac;

    public StartACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}