package com.basicstrong.designpatterns.behavioural.command;

public class DecreaseTemperatureCommand implements ICommandAC {
    private AC ac;

    public DecreaseTemperatureCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.decTemp();
    }
}