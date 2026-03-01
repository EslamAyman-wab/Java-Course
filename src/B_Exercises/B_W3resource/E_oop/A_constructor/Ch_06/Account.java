package B_Exercises.B_W3resource.E_oop.A_constructor.Ch_06;

public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {

        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        this.accountNumber = accountNumber;

        if (balance < 0.0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
