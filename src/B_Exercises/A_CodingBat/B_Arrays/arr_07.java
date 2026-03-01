package B_Exercises.A_CodingBat.B_Arrays;

public class arr_07 {
    public static void main(String[] args) {

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
