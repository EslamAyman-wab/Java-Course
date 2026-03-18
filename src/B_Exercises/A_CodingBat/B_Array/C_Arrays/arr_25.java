package B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_25 {
    public static void main(String[] args) {
        arr_25 solver = new arr_25();

        // Test 1
        int result1 = solver.start1(new int[]{1, 2, 3}, new int[]{1, 3});
        System.out.println("Test 1: " + result1); // Expected: 2 (both start with 1)

        // Test 2
        int result2 = solver.start1(new int[]{7, 2, 3}, new int[]{1});
        System.out.println("Test 2: " + result2); // Expected: 1 (only second starts with 1)

        // Test 3
        int result3 = solver.start1(new int[]{1, 2}, new int[]{});
        System.out.println("Test 3: " + result3); // Expected: 1 (only first starts with 1, second is empty)

        // Test 4
        int result4 = solver.start1(new int[]{4, 5, 6}, new int[]{8, 9});
        System.out.println("Test 4: " + result4); // Expected: 0 (neither starts with 1)
    }

    public int start1(int[] a, int[] b) {
        int count = 0;

        // 1. Check if array 'a' is NOT empty AND its first element is 1
        if (a.length > 0 && a[0] == 1){
            count++; // If true, add to the count
        }

        // 2. Check if array 'b' is NOT empty AND its first element is 1
        if (b.length > 0 && b[0] == 1){
            count++; // If true, add to the count
        }

        // 3. Return the total number of arrays that start with 1
        return count;
    }

}
