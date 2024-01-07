package com.basicstrong.designprinciples.solid.openclose.incorrect;


final class Rectangle  {
    final double length;
    final double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

final class Circle  {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

}

class AreaCalculator {
    Object shape;

    AreaCalculator(Object shape) {
        this.shape = shape;
    }

    public void calculateArea() throws Exception {
        if (shape instanceof Rectangle) {
            System.out.println("Area of Rectangle = " + ((Rectangle) shape).breadth * ((Rectangle) shape).length);
        } else if (shape instanceof Circle) {
            System.out.println("Area of Rectangle = " + (Math.PI * Math.sqrt(((Circle) shape).radius)));
        } else {
            throw new Exception("Invalid Shape");
        }
    }
}

public class Area {
    public static void main(String[] args) throws Exception {
        AreaCalculator areaCalculator = new AreaCalculator(new Rectangle(20, 10));
        areaCalculator.calculateArea();
    }
}
