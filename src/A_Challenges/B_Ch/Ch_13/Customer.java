package A_Challenges.B_Ch.Ch_13;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer (String name, String emailAddress) {
        this(name, 0.0, emailAddress);
    }

    public Customer() {
        System.out.println("This is the emty ");
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
