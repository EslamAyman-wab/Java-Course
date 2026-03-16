package A_Course.A_Challenges.B_Ch.Ch_18;

/**
 * The Main class shows **Polymorphism** in action.
 * Notice how we use a variable of type 'Car' (the parent) to hold 
 * different types of car objects (the children).
 */
public class Main {
    public static void main(String[] args) {

        // car1 is a Car reference, but it points to a GasPoweredCar object
        Car car1 = new GasPoweredCar("BMW", 25.4, 6);
        car1.startEngine(); // Calls the GasPoweredCar version
        car1.drive();
        car1.runEngine();

        System.out.println("-------------------------------");

        // car2 is a Car reference, but it points to an ElectricCar object
        Car car2 = new ElectricCar("Tesla", 100, 50_000);
        car2.startEngine(); // Calls the ElectricCar version
        car2.drive();
        car2.runEngine();

        System.out.println("-------------------------------");

        // car3 is a Car reference, but it points to a HybridCar object
        Car car3 = new HybridCar("BYD", 300.5, 20_000, 4);
        car3.startEngine(); // Calls the HybridCar version
        car3.drive();
        car3.runEngine();

        System.out.println("-------------------------------");
    }
}
