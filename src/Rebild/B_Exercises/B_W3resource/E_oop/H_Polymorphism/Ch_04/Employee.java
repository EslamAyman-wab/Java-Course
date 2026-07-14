package Rebild.B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_04;

public abstract class Employee {
    public abstract double calculateSalary();

    ;
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {

        return baseSalary +(baseSalary*bonus);
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private double workedHours;

    public Programmer(double hourlyRate, double workedHours) {
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate*workedHours;
    }
}
