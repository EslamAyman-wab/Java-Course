package A_Challenges.B_Ch.Ch_13;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Eslam", 20_000, "eslam.com");

        Customer customer2 = new Customer("Eslam", "eslam.com");

        Customer customer3 = new Customer();

        System.out.println("Customer1 = " +customer1 +
                "\n Customer2 = " + customer2  +
                "\n Customer3 = " + customer3);
    }
}
