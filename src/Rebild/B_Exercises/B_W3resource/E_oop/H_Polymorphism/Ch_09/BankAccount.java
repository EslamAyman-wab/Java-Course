package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_09;

public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    private double limit;

    public SavingsAccount(double balance, double limit) {
        super(balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        if (amount > limit) {
            System.out.println("You can't withdraw more than " + limit);
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
    private double limit;

    public CheckingAccount(double balance, double limit) {
        super(balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + (amount * 0.01);
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        if (amount > limit) {
            System.out.println("You can't withdraw more than " + limit);
            return;
        }
        if (balance < total) {
            System.out.println("Insufficient balance");
            return;
        }
        this.balance -= total;

    }
}