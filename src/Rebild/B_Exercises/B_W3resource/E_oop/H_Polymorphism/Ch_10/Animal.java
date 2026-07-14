package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_10;

public abstract class Animal {

    public abstract void eat();
    public abstract void sound();

}

class Lion extends Animal {
    public void eat() {
        System.out.println("Eating zepra");
    }
    public void sound() {
        System.out.println("WOOOOOO");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Eating cows");
    }

    public void sound() {
        System.out.println("Hoooooo");
    }

}
class Panther extends Animal {
    public void eat() {
        System.out.println("Eating sheeps");
    }
    public void sound() {
        System.out.println("Meoooo");
    }
}