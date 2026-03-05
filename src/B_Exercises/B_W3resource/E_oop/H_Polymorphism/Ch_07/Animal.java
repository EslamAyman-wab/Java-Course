package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_07;

public abstract class Animal {

    public abstract void move();

    public abstract void makeSound();
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

}

class Panthera extends Animal {
    @Override
    public void move() {
        System.out.println("Panthera walks");
    }

    @Override
    public void makeSound() {
        System.out.println("Panthera roars");
    }
}
