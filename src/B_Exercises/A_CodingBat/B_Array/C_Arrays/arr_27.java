package B_Exercises.A_CodingBat.B_Array.C_Arrays;

/**
 * CodingBat Array Exercise: has23
 *
 * Problem: Given an int array length 2, return true if it contains a 2 or a 3.
 *
 * Examples:
 * - has23([2, 5]) → true (contains 2)
 * - has23([4, 3]) → true (contains 3)
 * - has23([4, 5]) → false (contains neither 2 nor 3)
 */
public class arr_27 {
    public static void main(String[] args) {
        // Create an instance of arr_27 to test the has23 method
        arr_27 solution = new arr_27();

        // Test Case 1: Array contains 2 at first position
        // Expected: true
        int[] test1 = {2, 5};
        System.out.println("Test 1 - has23([2, 5]): " + solution.has23(test1));

        // Test Case 2: Array contains 3 at second position
        // Expected: true
        int[] test2 = {4, 3};
        System.out.println("Test 2 - has23([4, 3]): " + solution.has23(test2));

        // Test Case 3: Array contains both 2 and 3
        // Expected: true
        int[] test3 = {2, 3};
        System.out.println("Test 3 - has23([2, 3]): " + solution.has23(test3));

        // Test Case 4: Array contains 3 at first position
        // Expected: true
        int[] test4 = {3, 5};
        System.out.println("Test 4 - has23([3, 5]): " + solution.has23(test4));

        // Test Case 5: Array contains 2 at second position
        // Expected: true
        int[] test5 = {5, 2};
        System.out.println("Test 5 - has23([5, 2]): " + solution.has23(test5));

        // Test Case 6: Array contains neither 2 nor 3
        // Expected: false
        int[] test6 = {4, 5};
        System.out.println("Test 6 - has23([4, 5]): " + solution.has23(test6));
    }

    /**
     * Checks if an array of length 2 contains either 2 or 3.
     *
     * @param nums An integer array of length 2
     * @return true if the array contains 2 or 3, false otherwise
     */
    public boolean has23(int[] nums) {
        // Check if first element is 2 OR second element is 3
        if (nums[0] == 2 || nums[1] == 3) {
            return true;
        }
        // Check if first element is 3 OR second element is 2
        else if (nums[0] == 3 || nums[1] == 2) {
            return true;
        }

        // If neither condition is met, array doesn't contain 2 or 3
        return false;
    }
}
