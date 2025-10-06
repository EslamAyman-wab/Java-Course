package B_Coding_Exercise.B_Ex;

public class Ex_20 {
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
        }
        return false;
    }

}
