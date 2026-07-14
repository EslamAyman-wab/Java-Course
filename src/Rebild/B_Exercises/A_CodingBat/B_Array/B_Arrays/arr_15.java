package Rebild.B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_15 {
    public static void main(String[] args) {
        arr_15 obj = new arr_15();
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{11, 5, 9})));
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{2, 11, 3})));
    }
    public int[] maxEnd3(int[] nums) {
        
        if(nums[0] > nums[2]) {
            return new int[] {nums[0], nums[0], nums[0]};
        } else {
            return new int[] {nums[2], nums[2], nums[2]};
        }

    }
}
