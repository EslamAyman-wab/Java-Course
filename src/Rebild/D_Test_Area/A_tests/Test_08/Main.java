package Rebild.D_Test_Area.A_tests.Test_08;

public class Main {
    public static void main(String[] args) {
        Personalinformation personalinformation = new Personalinformation("John", "A.", "Doe", "O+", "123456789", "American", 1990);
        Department department = new Department(101, "Engineering");
        Employee employee = new Employee("John", "A.", "Doe", "O+", "123456789", "American", 1990, 1, 75000.0f, personalinformation);

        System.out.println(employee);

    }
}
