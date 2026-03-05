package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_07;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Bird and assign it to the variable bird of type Animal
        Animal bird = new Bird();
        // Create an instance of Panthera and assign it to the variable panthera of type Animal
        Animal panthera = new Panthera();

        // Call the performAction method with bird as the argument
        performAction(bird);
        // Call the performAction method with panthera as the argument
        performAction(panthera);
    }

    // Define the performAction method that takes an Animal object as a parameter
    public static void performAction(Animal animal) {
        // Call the move method on the animal object
        animal.move();
        // Call the makeSound method on the animal object
        animal.makeSound();
        
    }
}
