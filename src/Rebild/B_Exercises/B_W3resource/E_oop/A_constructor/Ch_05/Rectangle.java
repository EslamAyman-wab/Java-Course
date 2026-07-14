package Rebild.B_Exercises.B_W3resource.E_oop.A_constructor.Ch_05;

public class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(Rectangle rectangle) {
        // Initialize length with the length of the provided rectangle object
        this.length = rectangle.length;
        // Initialize width with the width of the provided rectangle object
        this.width = rectangle.width;
    }


}
