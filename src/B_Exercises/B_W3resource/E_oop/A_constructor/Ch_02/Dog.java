package B_Exercises.B_W3resource.E_oop.A_constructor.Ch_02;

public class Dog {
    private final String name;
    private final String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
