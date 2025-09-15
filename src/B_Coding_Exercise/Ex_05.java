package B_Coding_Exercise;

public class Ex_05 {
    //Implementing A Precise Leap Year Calculator To Enhance Conditional Reasoning
    public static void main(String[] args) {

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
