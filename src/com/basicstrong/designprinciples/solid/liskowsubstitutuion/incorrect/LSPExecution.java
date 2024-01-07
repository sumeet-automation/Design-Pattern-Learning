package com.basicstrong.designprinciples.solid.liskowsubstitutuion.incorrect;

abstract class Bird {
    void fly() {
        System.out.println("flying behaviour");
    }
}

class Sparrow extends Bird {

}

class Ostich extends Bird {

}

public class LSPExecution {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.fly();

        Bird osticsh = new Ostich();
        osticsh.fly();
    }
}
