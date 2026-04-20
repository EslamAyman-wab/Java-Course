package D_Test_Area.B_tests.test_13;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> printer1 = new Printer<>(23);
        printer1.print();

        Printer<Double> printer2 = new Printer<>(23.33);
        printer2.print();

        System.out.println("this is a test");

    }
}
