package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_09;

public abstract class BankAccount {
    protected double balance;

    public void deposit(double amount) {

        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

class SavingsAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        if (amount > 1000) {
            System.out.println("You can't withdraw more than 1000");
            return;
        }
        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        super.withdraw(amount);

    }
}

class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        double total = amount + (amount * 0.01);
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        if (balance < total) {
            System.out.println("Insufficient balance");
            return;
        }
        this.balance -= total;

    }
}
