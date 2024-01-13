package com.basicstrong.designpatterns.behavioural.command;

public class StopACCommand implements ICommandAC {
    private AC ac;

    public StopACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}