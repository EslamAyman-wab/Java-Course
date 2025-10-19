package A_Challenges.B_Ch.Ch_12;

public class bank_account {

    private long accNumbre = 0;
    private double accBalance = 0;
    private  String CustomerName = " ";
    private String email = " ";
    private String phoneNumber = " ";

    public void depositFunds (double depositAmount ){
        accBalance+= depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $ " + accBalance);
    }

    public void withdrawFunds(double withrawalAmonunt){
        if (accBalance - withrawalAmonunt < 0){
            System.out.println("Insufficient Funds! You only have $ " + accBalance + " in your acconunt");
        } else {
            accBalance-=withrawalAmonunt;
            System.out.println("withdrawal of $ " + withrawalAmonunt + "processed, Remaining balace = $"+ accBalance);
        }
    }

    public long getAccNumbre() {
        return accNumbre;
    }

    public void setAccNumbre(long accNumbre) {
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
