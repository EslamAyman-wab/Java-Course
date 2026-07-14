package Rebild.B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_06 {
    public static void main(String[] args) {
        arr_06 obj = new arr_06();
        System.out.println(obj.double23(new int[]{2, 2})); // true
        System.out.println(obj.double23(new int[]{3, 3})); // true
        System.out.println(obj.double23(new int[]{2, 3})); // false
    }
    public boolean double23(int[] nums) {
        return nums.length == 2
                && nums[0] == nums[1]
                && (nums[0] == 2 || nums[0] == 3);
    }


}
