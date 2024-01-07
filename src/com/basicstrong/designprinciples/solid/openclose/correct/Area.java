package com.basicstrong.designprinciples.solid.openclose.correct;

import java.util.Objects;

interface Shape {
    double calculateArea();
}

record Rectangle(double length, double breadth) implements Shape {

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

record Circle(double radius) implements Shape {
     @Override
     public double calculateArea() {
         return Math.PI * radius * radius;
     }
 }

class AreaCalculator {
    Shape shape;

    AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public void calculateArea(){
        System.out.println(shape.calculateArea());
    }
}

public class Area {
    public static void main(String[] args) throws Exception {
        AreaCalculator areaCalculator = new AreaCalculator(new Rectangle(20, 10));
        AreaCalculator areaCalculator2 = new AreaCalculator(new Circle(10));
        areaCalculator.calculateArea();
        areaCalculator2.calculateArea();
    }
}
