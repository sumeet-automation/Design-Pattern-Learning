package com.basicstrong.designpatterns.behavioural.command;

public class Main {

    public static void main(String[] args) {
        AC ac = new AC();
        ACRemote acRemote = new ACRemote(new StartACCommand(ac));
        acRemote.pressButton();
        new ACRemote(new IncreaseTemperatureCommand(ac)).pressButton();
        new ACRemote(new DecreaseTemperatureCommand(ac)).pressButton();
        new ACRemote(new StopACCommand(ac)).pressButton();
    }
}
