package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_08;

public abstract class Shape {

    public abstract void draw();

    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square draw");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

}


class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }

    @Override
    public double calculateArea() {

        return (base * height) / 2;
    }
}
                                                                                                                                                                                   