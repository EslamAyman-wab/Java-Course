package B_Coding_Exercise.A_Ex;

public class Ex_05 {
    //Implementing A Precise Leap Year Calculator To Enhance Conditional Reasoning
    public static void main(String[] args) {
        // Test case 1: Common leap year (divisible by 4)
        System.out.println("Year 2024 is leap year: " + isLeapYear(2024));

        // Test case 2: Century year (divisible by 100 but not 400)
        System.out.println("Year 1900 is leap year: " + isLeapYear(1900));

        // Test case 3: Century leap year (divisible by 400)
        System.out.println("Year 2000 is leap year: " + isLeapYear(2000));

        // Test case 4: Common year
        System.out.println("Year 2023 is leap year: " + isLeapYear(2023));

        // Test case 5: Invalid year
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;

            } else {
                if (year % 400 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
