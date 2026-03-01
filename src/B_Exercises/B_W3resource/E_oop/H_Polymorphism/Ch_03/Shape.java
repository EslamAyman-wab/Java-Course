package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_03;

public abstract class Shape {

    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}

class Rectangele extends Shape {
    private double width;
    private double height;

    public Rectangele(double width, double height) {
        if(width <= 0 || height <= 0){
            throw new IllegalArgumentException("Width and height must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Traiangle extends Shape {
    private double base;
    private double height;

    public Traiangle(double base, double height) {
        if(base <= 0 || height <= 0){
            throw new IllegalArgumentException("Base and height must be positive.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}