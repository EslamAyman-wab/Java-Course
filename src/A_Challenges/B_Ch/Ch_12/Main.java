package A_Challenges.B_Ch.Ch_12;

public class Main {
    public static void main(String[] args) {

        bank_account bank_account = new bank_account("12345",0.00,"John Doe","esla.com","123-456-7890");
        System.out.println(
                "Account Number: " + bank_account.getAccNumbre() +
                "\nCustomer Name: " + bank_account.getCustomerName() +
                "\nEmail: " + bank_account.getEmail() +
                "\nPhone Number: " + bank_account.getPhoneNumber() +
                "\nBalance: $" + bank_account.getAccBalance()
        );

    }
}
