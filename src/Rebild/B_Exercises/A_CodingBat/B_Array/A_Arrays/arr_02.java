package Rebild.B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_02 {
    public static void main(String[] args) {
        arr_02 obj = new arr_02();
        System.out.println(obj.sameFirstLast(new int[]{1, 2, 3})); // false
        System.out.println(obj.sameFirstLast(new int[]{1, 2, 3, 1})); // true
        System.out.println(obj.sameFirstLast(new int[]{1, 2, 1})); // true
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }
        }
        return false;
    }

}
