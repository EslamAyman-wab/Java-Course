package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_06;

public abstract class Shape {


    public abstract double getPerimeter();

    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return (2 *(length + width));
    }
    @Override
    public double getArea() {
        return length * width;
    }

}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    @Override
    public double getArea() {
        double s = getPerimeter() /2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

}