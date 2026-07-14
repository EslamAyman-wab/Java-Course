package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_11;

public abstract class Vehicle {

    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");

    }
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped when the key was turned off.");

    }
}
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick-start.");

    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped when ignition was turned off.");

    }
}
