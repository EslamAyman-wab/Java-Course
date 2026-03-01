package E_W3resource.E_oop.H_Polymorphism.Ch_01;

import org.w3c.dom.ls.LSOutput;

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
