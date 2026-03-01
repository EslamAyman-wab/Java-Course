package B_Exercises.A_CodingBat.B_Arrays;

public class arr_02 {
    public static void main(String[] args) {

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
