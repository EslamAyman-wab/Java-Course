package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_01;

abstract class Animal {
       void sound() {
            System.out.println("Animal makes a sound");
        }
}

 class Bird extends Animal {
     @Override
     void sound() {
            System.out.println("Bird chirps");
     }
 }
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
