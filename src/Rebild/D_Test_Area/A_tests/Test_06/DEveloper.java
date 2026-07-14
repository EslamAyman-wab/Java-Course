package Rebild.D_Test_Area.A_tests.Test_06;

public class DEveloper extends test_01 {
    String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public DEveloper(String name , String emailAddress , String phone , String department , String address , int yearOfBirth , String projectName){
        super(name , emailAddress , phone , department , address , yearOfBirth);
        this.projectName = projectName;
    }
}
