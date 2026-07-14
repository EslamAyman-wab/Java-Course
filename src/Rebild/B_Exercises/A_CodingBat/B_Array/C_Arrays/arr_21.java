package Rebild.B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_21 {
    public static void main(String[] args) {
        arr_21 obj = new arr_21();

        // Test case 1
        int[] result1 = obj.makeLast(new int[]{4, 5, 6});
        System.out.println("Test 1: [4, 5, 6] -> " + java.util.Arrays.toString(result1));

        // Test case 2
        int[] result2 = obj.makeLast(new int[]{1, 2});
        System.out.println("Test 2: [1, 2] -> " + java.util.Arrays.toString(result2));

        // Test case 3
        int[] result3 = obj.makeLast(new int[]{3});
        System.out.println("Test 3: [3] -> " + java.util.Arrays.toString(result3));
    }
    public int[] makeLast(int[] nums) {
        int newLength = nums.length * 2;
        int[] newNums = new int[newLength];
        newNums[newLength - 1] = nums[nums.length - 1];
        return newNums;
    }
}
