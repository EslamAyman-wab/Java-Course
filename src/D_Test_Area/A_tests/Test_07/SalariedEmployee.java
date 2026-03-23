package D_Test_Area.A_tests.Test_07;

public class SalariedEmployee  extends Employee{
    private float bouns;

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bouns) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }

    @Override
    public float getSalary() {
        return super.getSalary()+ bouns;
    }
}
