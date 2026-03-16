package B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_21 {
    public static void main(String[] args) {

    }
    public int[] makeLast(int[] nums) {
        int newLength = nums.length * 2;
        int[] newNums = new int[newLength];
        newNums[newLength - 1] = nums[nums.length - 1];
        return newNums;
    }
}
