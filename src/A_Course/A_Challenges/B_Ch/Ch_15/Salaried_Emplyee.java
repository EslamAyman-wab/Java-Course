package A_Course.A_Challenges.B_Ch.Ch_15;

public class Salaried_Emplyee extends Employee  {

    double annualSalary;
     boolean isRetired;

    public Salaried_Emplyee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double callectPay(){
        return  annualSalary /26;
    }
}
