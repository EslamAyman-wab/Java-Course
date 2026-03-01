package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_01;

public class Main {
    public static void main(String[] args) {


        Bird bird = new Bird();
        bird.sound();

        Cat cat = new Cat();
        cat.sound();

        Animal a = new Bird();
        a.sound();
    }
}
