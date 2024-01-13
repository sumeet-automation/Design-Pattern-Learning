package com.basicstrong.designpatterns.behavioural.command;

public class AC{
    public void turnOn() {
        System.out.println("AC is on");
    }
    public void turnOff() {
        System.out.println("AC is off");
    }
    public void incTemp() {
        System.out.println("Temperature turned up");
    }
    public void decTemp() {
        System.out.println("Temperature turned down");
    }

}