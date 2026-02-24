package E_W3resource.E_oop.A_constructor.Ch_01;

import org.w3c.dom.ls.LSOutput;

public class Cat {

    private String name;
    private double age;


    public Cat() {
        this.name = "Unknown";
        this.age = 0.0;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

}
