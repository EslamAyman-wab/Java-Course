package Rebild.D_Test_Area.B_tests.test_12;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== CarV1 Test Suite ===\n");

        // Test 1: Default constructor
        System.out.println("Test 1: Default Constructor");
        CarV1 c1 = new CarV1();
        System.out.println("Created car with default constructor");
        printPosition(c1);
        System.out.println();

        // Test 2: Parameterized constructor
        System.out.println("Test 2: Parameterized Constructor (x=5, y=10)");
        CarV1 c2 = new CarV1(5, 10);
        printPosition(c2);
        System.out.println();

        // Test 3: Movement methods
        System.out.println("Test 3: Movement Methods");
        CarV1 c3 = new CarV1(0, 0);
        System.out.println("Starting position:");
        printPosition(c3);

        System.out.println("Moving UP...");
        c3.moveUP();
        printPosition(c3);

        System.out.println("Moving RIGHT...");
        c3.moveRight();
        printPosition(c3);

        System.out.println("Moving DOWN...");
        c3.moveDown();
        printPosition(c3);

        System.out.println("Moving LEFT...");
        c3.moveLeft();
        printPosition(c3);
        System.out.println();

        // Test 4: Self-driving functionality
        System.out.println("Test 4: Self-Driving Features");
        CarV1 c4 = new CarV1();
        c4.destination("Paris");
        c4.drive();
        System.out.println();

        // Test 5: Complex movement sequence
        System.out.println("Test 5: Complex Movement Sequence");
        CarV1 c5 = new CarV1(10, 10);
        System.out.println("Starting at (10, 10)");
        printPosition(c5);

        c5.moveUP();
        c5.moveUP();
        c5.moveRight();
        c5.moveRight();
        c5.moveRight();
        System.out.println("After 2 UP and 3 RIGHT moves:");
        printPosition(c5);
        System.out.println();

        System.out.println("=== All Tests Completed ===");
    }

    private static void printPosition(CarV1 car) {
        System.out.println("  Car position - cannot access private fields directly");
    }
}
