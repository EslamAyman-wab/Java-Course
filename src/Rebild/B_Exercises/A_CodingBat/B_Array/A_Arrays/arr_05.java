package Rebild.B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_05 {
    public static void main(String[] args) {
        arr_05 obj = new arr_05();
        System.out.println(obj.sum3(new int[]{1, 2, 3})); // 6
        System.out.println(obj.sum3(new int[]{5, 11, 2})); // 18
        System.out.println(obj.sum3(new int[]{7, 0, 0})); // 7
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
}
