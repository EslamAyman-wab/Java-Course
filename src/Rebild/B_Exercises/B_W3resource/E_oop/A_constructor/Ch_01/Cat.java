package Rebild.B_Exercises.B_W3resource.E_oop.A_constructor.Ch_01;

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
