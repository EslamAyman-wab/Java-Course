package B_Exercises.B_W3resource.E_oop.A_constructor.Ch_04;

public class Main {
    public static void main(String[] args) {
        // Create a new Student object using the default constructor
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.getStudentId());
        System.out.println("Student1 Name: " + student1.getStudentName());
        System.out.println("Student1 Grade: " + student1.getGrade());

        // Create a new Student object using the parameterized constructor
        Student student2 = new Student(101, "Cullen", 90);
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.getStudentId());
        System.out.println("Student2 Name: " + student2.getStudentName());
        System.out.println("Student2 Grade: " + student2.getGrade());

    }
}
