package B_Exercises.A_CodingBat.B_Array.B_Arrays;

import java.util.Arrays;

public class arr_14 {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(nums)));

    }
    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};

    }

}
