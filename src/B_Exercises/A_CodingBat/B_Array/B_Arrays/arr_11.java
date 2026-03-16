package B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_11 {
    public static void main(String[] args) {

    }

    public int[] swapEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];

        nums[0] = last;
        nums[nums.length - 1] = first;

        return nums;

    }

}
