package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_12;

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
        System.out.println("Drawing Circle");
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Cylinder");
    }
    @Override
    public double calculateArea() {
        // Surface area of a cylinder: 2πr(r + h)
        return 2 * Math.PI * radius * (radius + height);
    }
}
