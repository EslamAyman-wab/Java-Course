package B_Exercises.A_CodingBat.C_Arrays;

public class arr_19 {
    public static void main(String[] args) {

    }

    public int[] frontPiece(int[] nums) {
        int size = Math.min(2, nums.length);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = nums[i];
        }

        return result;
    }
}
