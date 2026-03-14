package B_Exercises.A_CodingBat.C_Arrays;

public class arr_19 {
    public static void main(String[] args) {

    }

    public int[] frontPiece(int[] nums) {
        int size = Math.min(2, nums.length);
        int[] result = new int[size];

        if ( nums.length >= 2) {
            return result = new int[] {nums[0], nums[1]};
        } else {
            return result;
        }
    }
}
