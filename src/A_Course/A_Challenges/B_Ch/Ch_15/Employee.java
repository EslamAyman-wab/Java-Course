package A_Course.A_Challenges.B_Ch.Ch_15;

public class Employee extends Worker{

    private long employeed;
    private  String hireDate;
    private static int employeeNo = 1;



    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeed =Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeed=" + employeed +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
