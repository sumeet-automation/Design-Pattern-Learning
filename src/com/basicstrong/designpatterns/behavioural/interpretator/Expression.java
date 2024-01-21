package com.basicstrong.designpatterns.behavioural.interpretator;

public abstract class Expression {
    abstract int interpret();
}

class Number extends Expression{
    protected int value = 0;

    public Number(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}

class Add extends Expression{
    protected Expression lhs;
    protected Expression rhs;

    public Add(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    int interpret() {
        return lhs.interpret()+rhs.interpret();
    }
}

class Substract extends Expression{
    protected Expression lhs;
    protected Expression rhs;

    public Substract(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    int interpret() {
        return lhs.interpret()-rhs.interpret();
    }
}

class Multiply extends Expression{
    protected Expression lhs;
    protected Expression rhs;

    public Multiply(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    @Override
    int interpret() {
        return lhs.interpret()*rhs.interpret();
    }
}

class Divide extends Expression{
    protected Expression lhs;
    protected Expression rhs;
    public Divide(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    @Override
    int interpret() {
        return lhs.interpret()/rhs.interpret();
    }
}