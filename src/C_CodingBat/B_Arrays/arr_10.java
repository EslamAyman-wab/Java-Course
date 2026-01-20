package C_CodingBat.B_Arrays;

public class arr_10 {
    public static void main(String[] args) {


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
