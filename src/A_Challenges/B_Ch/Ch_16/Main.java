// java
package A_Challenges.B_Ch.Ch_16;

public class Main {
    public static void main(String[] args) {

        int age = 23;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);


        String name = "Eslam Ayman";

        int result = name.indexOf("E");

        System.out.println("The leater 'E'  = " + result);

        //printInformation("Hello World");
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d%n", length);

    }
}
