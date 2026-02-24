package E_W3resource.E_oop.A_constructor.Ch_02;

//2. Parameterized Constructor
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Blak");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        System.out.println(dog.toString());
    }

}
