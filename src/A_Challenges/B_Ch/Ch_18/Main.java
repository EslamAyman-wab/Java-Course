package A_Challenges.B_Ch.Ch_18;

public class Main {
    public static void main(String[] args) {


        Car car1 = new GasPoweredCar("BMW", 25.4, 200);

        car1.startEngine();
        car1.drive();
        car1.runEngine();

        System.out.println("-------------------------------");

        Car car2 = new ElectricCar("Tesla", 100, 50_000);
        car2.startEngine();
        car2.drive();
        car2.runEngine();

        System.out.println("-------------------------------");


        Car car3 = new HybridCar("BYD", 300.5, 20_000, 200);

        car3.startEngine();
        car3.drive();
        car3.runEngine();

        System.out.println("-------------------------------");

    }
}
