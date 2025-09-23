package B_Coding_Exercise.A_Ex;

public class Ex_07 {
    //Creating An Equal Sum Checker For Strengthening Arithmetic And Comparison Operations
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 2));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        return false;
    }

}
