package Rebild.B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_09 {
    public static void main(String[] args) {
        arr_09 obj = new arr_09();
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{1, 2, 3, 4}))); // [2, 3]
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}))); // [2, 3]
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{1, 2}))); // [1, 2]
    }
    public int[] makeMiddle(int[] nums) {

        int [] mid = {nums[(nums.length/2)-1],nums[nums.length/2]};

        return mid;

    }
}
