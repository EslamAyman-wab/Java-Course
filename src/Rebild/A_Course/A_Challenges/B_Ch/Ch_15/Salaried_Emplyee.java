package Rebild.A_Course.A_Challenges.B_Ch.Ch_15;

/**
 * **Salaried_Emplyee** is even more specialized.
 * It inherits from Employee, which in turn inherits from Worker.
 */
public class Salaried_Emplyee extends Employee {

    double annualSalary;
    boolean isRetired;

    public Salaried_Emplyee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    /**
     * OVERRIDES the callectPay method from Worker.
     * This provides the specific logic for how a salaried employee is paid.
     */
    @Override
    public double callectPay() {
        return annualSalary / 26; // Assuming 26 pay periods in a year
    }
}
