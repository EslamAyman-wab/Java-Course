package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_03;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangele(4, 6);
        Shape s3 = new Traiangle(3, 8);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());
        System.out.println(s3.calculateArea());


    }
}
