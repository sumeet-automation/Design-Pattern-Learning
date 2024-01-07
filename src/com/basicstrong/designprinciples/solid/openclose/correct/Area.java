package com.basicstrong.designprinciples.solid.openclose.correct;

import java.util.Objects;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private final double length;
    private final double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

 class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

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

    public void calculateArea() throws Exception {
        shape.calculateArea();
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
