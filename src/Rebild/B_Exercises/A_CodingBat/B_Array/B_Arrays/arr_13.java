package Rebild.B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_13 {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(java.util.Arrays.toString(rotateLeft3(new int[]{7, 0, 0})));
    }
    public static int[] rotateLeft3(int[] nums) {

        return new int[] {nums[1], nums[2], nums[0]};
    }
}
