package C_CodingBat.B_Arrays;

public class arr_10 {
    public static void main(String[] args) {
        arr_10 solution = new arr_10();

        // Test case 1: Basic test
        int[] a1 = {1, 2};
        int[] b1 = {3, 4};
        int[] result1 = solution.plusTwo(a1, b1);
        System.out.print("Test 1: plusTwo([1,2], [3,4]) = [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Test case 2: Negative numbers
        int[] a2 = {-1, 5};
        int[] b2 = {0, 10};
        int[] result2 = solution.plusTwo(a2, b2);
        System.out.print("Test 2: plusTwo([-1,5], [0,10]) = [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Test case 3: Zeros
        int[] a3 = {0, 0};
        int[] b3 = {0, 0};
        int[] result3 = solution.plusTwo(a3, b3);
        System.out.print("Test 3: plusTwo([0,0], [0,0]) = [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public int[] plusTwo(int[] a, int[] b) {


        int[] sum = new int[a.length + b.length];

        sum[0] = a[0];
        sum[1] = a[1];
        sum[2] = b[0];
        sum[3] = b[1];
        return sum;
    }

}
