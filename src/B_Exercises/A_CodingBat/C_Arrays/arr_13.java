package B_Exercises.A_CodingBat.C_Arrays;

import java.util.Arrays;

public class arr_13 {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3};
        System.out.println(Arrays.toString(rotateLeft3(nums)));

    }
    public static int[] rotateLeft3(int[] nums) {

        return new int[] {nums[1], nums[2], nums[0]};
    }
}
