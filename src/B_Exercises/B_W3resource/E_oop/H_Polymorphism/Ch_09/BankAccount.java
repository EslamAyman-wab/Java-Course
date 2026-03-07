package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_09;

public abstract class BankAccount {

    public void deposit(double amount) {
    }

    public void withdraw(double amount) {
    }
} 

    class SavingsAccount extends BankAccount {

        @Override
        public void withdraw(double amount) {
                super.withdraw(amount);
        }
    }

class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        }
    }
}