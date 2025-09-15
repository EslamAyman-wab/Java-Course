package B_Coding_Exercise;

public class Ex_06 {
    //Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.15));


    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        int a = (int) (one * 1000);
        int b = (int) (two * 1000);

        if (a == b) {
            return true;
        }
        return false;

    }
}
