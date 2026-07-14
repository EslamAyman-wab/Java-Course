package Rebild.B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_26 {
    public static void main(String[] args) {
        arr_26 solver = new arr_26();

        // Test 1: a has 2+ elements
        int[] result1 = solver.make2(new int[]{4, 5}, new int[]{1, 2, 3});
        printArray("Test 1", result1); // Expected: [4, 5]

        // Test 2: a has 1 element
        int[] result2 = solver.make2(new int[]{4}, new int[]{1, 2, 3});
        printArray("Test 2", result2); // Expected: [4, 1]

        // Test 3: a is empty
        int[] result3 = solver.make2(new int[]{}, new int[]{1, 2});
        printArray("Test 3", result3); // Expected: [1, 2]

        // Test 4: b is empty (but a has 2+)
        int[] result4 = solver.make2(new int[]{1, 2, 3}, new int[]{});
        printArray("Test 4", result4); // Expected: [1, 2]
    }

    private static void printArray(String label, int[] arr) {
        System.out.print(label + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }

    public int[] make2(int[] a, int[] b) {
        // 1. Decide how many elements to take from array 'a' (at most 2)
        int fromA = Math.min(2, a.length);
        
        // 2. Decide how many elements we still need from array 'b'
        int fromB = 2 - fromA;
        
        // 3. Create the result array of length 2
        int[] result = new int[2];
        
        // 4. Copy elements from 'a' into 'result' starting at index 0
        System.arraycopy(a, 0, result, 0, fromA);
        
        // 5. Copy elements from 'b' into 'result' starting after the 'a' elemen ts
        System.arraycopy(b, 0, result, fromA, fromB);
        
        return result;
    }
}
