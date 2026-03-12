package B_Exercises.A_CodingBat.C_Arrays;


import java.util.Arrays;

public class arr_12 {
    public static void main(String[] args) {

        int [] a = {1, 2};
        int [] b = {3, 4};
        System.out.println(Arrays.toString(biggerTwo(a, b)));

    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA >= sumB) {
            return a;
        } else {
            return b;
        }

    }
}
