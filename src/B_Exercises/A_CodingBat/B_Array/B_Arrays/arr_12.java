package B_Exercises.A_CodingBat.B_Array.B_Arrays;


import java.util.Arrays;

public class arr_12 {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(java.util.Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
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
