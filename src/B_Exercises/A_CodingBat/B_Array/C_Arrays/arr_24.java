package B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_24 {
    public static void main(String[] args) {
        arr_24 solver = new arr_24();

        // Test 1
        int result1 = solver.maxTriple(new int[]{1, 2, 3});
        System.out.println("Test 1: " + result1); // Expected: 3

        // Test 2
        int result2 = solver.maxTriple(new int[]{1, 5, 3});
        System.out.println("Test 2: " + result2); // Expected: 5

        // Test 3
        int result3 = solver.maxTriple(new int[]{5, 2, 3});
        System.out.println("Test 3: " + result3); // Expected: 5

        // Test 4
        int result4 = solver.maxTriple(new int[]{1, 2, 3, 1, 1});
        System.out.println("Test 4: " + result4); // Expected: 3
    }
    public int maxTriple(int[] nums) {
        // 1. Get the first element
        int first = nums[0];
        // 2. Get the last element
        int last = nums[nums.length-1];
        // 3. Get the middle element
        int mid = nums[nums.length/2];
        
        // 4. Compare them to find the biggest one
        // First compare mid and last, then compare the winner to first.
        return Math.max(first, Math.max(mid, last));
    }

}
