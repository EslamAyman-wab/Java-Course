package Rebild.B_Exercises.B_W3resource.E_oop.A_constructor.Ch_04;

public class Student {

    private int studentId;
    private String studentName;
    private  int grade;

    public Student() {
      this(0,"Unknown",0);
    }

    public Student(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }
}
