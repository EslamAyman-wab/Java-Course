package Rebild.A_Course.A_Challenges.B_Ch.Ch_12;

/**
 * Represents a simple Bank Account with balance management.
 */
public class bank_account {

    // Private fields to encapsulate account data (Encapsulation)
    private String accNumbre;
    private double accBalance;
    private String CustomerName;
    private String email;
    private String phoneNumber;

    /**
     * Constructor to initialize the bank account with specific values.
     */
    public bank_account(String accNumbre, double accBalance, String customerName, String email, String phoneNumber) {
        this.accNumbre = accNumbre;
        this.accBalance = accBalance;
        CustomerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Adds money to the account balance.
     * @param depositAmount The amount to add.
     */
    public void depositFunds(double depositAmount) {
        accBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $ " + accBalance);
    }

    /**
     * Removes money from the account balance if funds are sufficient.
     * @param withrawalAmonunt The amount to withdraw.
     */
    public void withdrawFunds(double withrawalAmonunt) {
        // Check if there's enough money before processing the withdrawal
        if (accBalance - withrawalAmonunt < 0) {
            System.out.println("Insufficient Funds! You only have $ " + accBalance + " in your acconunt");
        } else {
            accBalance -= withrawalAmonunt;
            System.out.println("withdrawal of $ " + withrawalAmonunt + " processed, Remaining balace = $" + accBalance);
        }
    }

    // --- Getters and Setters (Allowing controlled access to private fields) ---

    public String getAccNumbre() {
        return accNumbre;
    }

    public void setAccNumbre(String accNumbre) {
        this.accNumbre = accNumbre;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
