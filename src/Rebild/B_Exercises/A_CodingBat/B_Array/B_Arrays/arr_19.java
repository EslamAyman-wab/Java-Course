package Rebild.B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_19 {
    public static void main(String[] args) {
        arr_19 obj = new arr_19();
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{1})));
    }

    public int[] frontPiece(int[] nums) {
        int size = Math.min(2, nums.length);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = nums[i];
        }

        return result;
    }
}
