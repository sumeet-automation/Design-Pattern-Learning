package com.basicstrong.designpatterns.behavioural.command;

public class IncreaseTemperatureCommand implements ICommandAC {
    private AC ac;

    public IncreaseTemperatureCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.incTemp();
    }
}