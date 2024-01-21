package com.basicstrong.designpatterns.behavioural.interpretator;

import java.util.Stack;

public class Evaluator {
    public Expression parse(String text) throws Exception {
        Stack<Expression> stack = new Stack<>();
        String[] words = text.split(" ");
        for (String word : words) {
            Expression lhs = null, rhs = null;
            switch (word) {
                case "+" -> {
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Add(lhs, rhs));
                }
                case "-" -> {
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Substract(lhs, rhs));
                }
                case "*" -> {
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Multiply(lhs, rhs));
                }
                case "/" -> {
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Divide(lhs, rhs));
                }
                default -> stack.push(new Number(Integer.parseInt(word)));
            }
        }
        return stack.pop();
    }
}
