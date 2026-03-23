package D_Test_Area.A_tests.Test_08;

public class Personalinformation {
    private String firstName;
    private String middleName;
    private String lastName;
    private String bloodGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBirth;

    public Personalinformation() {
    }

    public Personalinformation(String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }


    @Override
    public String toString() {
        return "Personalinformation{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
