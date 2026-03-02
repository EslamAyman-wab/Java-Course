package D_Test_Area.Test_08;

public class Employee extends Personalinformation {
    private int id;
    private float salary;
    private Personalinformation personalinformation;
    private Department dept;

    public Employee(String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality,
        int yearOfBirth, int id, float salary, Personalinformation personalinformation) {
        super(firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        this.id = id;
        this.salary = salary;
        this.personalinformation = personalinformation;
    }
}
