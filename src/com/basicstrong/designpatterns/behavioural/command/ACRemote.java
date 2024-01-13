package com.basicstrong.designpatterns.behavioural.command;

public class ACRemote {
    private ICommandAC iCommandAC;

    public ACRemote(ICommandAC iCommandAC) {
        this.iCommandAC = iCommandAC;
    }

    public void pressButton() {
        iCommandAC.execute();
    }
}
