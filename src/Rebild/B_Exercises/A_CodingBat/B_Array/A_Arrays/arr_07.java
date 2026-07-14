package Rebild.B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_07 {
    public static void main(String[] args) {
        arr_07 obj = new arr_07();
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{1, 2, 3}))); // [1, 2, 0]
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{2, 3, 5}))); // [2, 0, 5]
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{1, 2, 1}))); // [1, 2, 1]
    }

    public int[] fix23(int[] nums) {
        if ((nums[0] == 2 && nums[1] == 3)) {
            nums [1] = 0;
        }

        if ((nums[1] == 2 && nums[2] == 3)) {
            nums [2] = 0;
        }

        return nums;
    }

}
