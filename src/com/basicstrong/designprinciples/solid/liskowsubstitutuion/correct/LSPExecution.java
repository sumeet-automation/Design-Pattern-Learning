package com.basicstrong.designprinciples.solid.liskowsubstitutuion.correct;

abstract class Bird {
    void getInfo() {
        System.out.println(String.format("Name of the bird is %s", this.getClass().getSimpleName()));
    }
}

abstract class FlyingBird extends Bird {

    void fly() {
        System.out.println(String.format("%s loves flying..", this.getClass().getSimpleName()));
    }
}

class Sparrow extends FlyingBird {

}

class Ostich extends Bird {

}

public class LSPExecution {

    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();
        sparrow.getInfo();

        Bird osticsh = new Ostich();
        osticsh.getInfo();
    }
}
