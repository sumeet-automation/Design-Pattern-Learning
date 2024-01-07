package com.basicstrong.designprinciples.solid.interfacesegregation.incorrect;

interface Worker{
    public void work();
    public void sleep() throws Exception;
}

class Human implements Worker{

    @Override
    public void work() {
        System.out.println("Working like  a human");
    }

    @Override
    public void sleep() {
        System.out.println("Human loves Sleeps");
    }
}


class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Working like  a robot. 24*7");
    }

    @Override
    public void sleep() throws Exception {
        throw new Exception("Robots do not sleep. Hence, violating Interface Segregation Principle");
    }
}
public class ISP {
    public static void main(String[] args) {

    }
}
