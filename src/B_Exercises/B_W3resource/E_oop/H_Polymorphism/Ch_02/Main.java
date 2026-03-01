package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_02;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.speedUp(); // Output: Car is moving at 10 km/h
        bicycle.speedUp(); // Output: Bicycle is moving at 5 km/h
    }
}
