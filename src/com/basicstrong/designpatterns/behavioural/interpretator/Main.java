package com.basicstrong.designpatterns.behavioural.interpretator;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Evaluator().parse("25 5 4 * -").interpret());
    }
}
