package A_Course.A_Challenges.B_Ch.Ch_15;

/**
 * **Employee** is a specialized version of Worker.
 * It "extends" Worker, inheriting all its fields and methods.
 */
public class Employee extends Worker {

    private long employeed;
    private String hireDate;
    private static int employeeNo = 1; // Shared across all Employee objects

    public Employee(String name, String birthDate, String hireDate) {
        // 'super' calls the constructor of the parent class (Worker)
        super(name, birthDate);
        this.employeed = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        // super.toString() calls the parent class's toString() method
        return "Employee{" +
                "employeed=" + employeed +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
