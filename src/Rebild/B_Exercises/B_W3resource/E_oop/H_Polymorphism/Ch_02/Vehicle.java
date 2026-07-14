package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_02;

public abstract class Vehicle {
    private int speed;

    public int incrementSpeed(int increment) {
        speed += increment;
        return speed;
    }

    public abstract void speedUp();
}

class Car extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Car is moving at " + incrementSpeed(10) + " km/h");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Bicycle is moving at " + incrementSpeed(5) + " km/h");
    }
}
