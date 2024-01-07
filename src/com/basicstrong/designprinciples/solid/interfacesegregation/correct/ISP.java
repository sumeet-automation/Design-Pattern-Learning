package com.basicstrong.designprinciples.solid.interfacesegregation.correct;

interface Worker {
    public void work();
}

interface Sleeper {
    public void sleep();
}

class Human implements Worker, Sleeper {

    @Override
    public void work() {
        System.out.println("Working like  a human");
    }

    @Override
    public void sleep() {
        System.out.println("Human loves Sleeps");
    }
}


class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Working like  a robot. 24*7");
    }

}

public class ISP {
    public static void main(String[] args) {

    }
}
