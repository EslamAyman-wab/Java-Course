package Rebild.B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_22 {
    public static void main(String[] args) {
        // Create an instance of arr_22 to call its non-static method
        arr_22 obj = new arr_22();

        // Test Case 1: Both arrays have elements
        // Expected output: [1, 7]
        System.out.println("Test 1: " + java.util.Arrays.toString(obj.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));

        // Test Case 2: One array is empty
        // Expected output: [1]
        System.out.println("Test 2: " + java.util.Arrays.toString(obj.front11(new int[]{1}, new int[]{})));

        // Test Case 3: Both arrays are empty
        // Expected output: []
        System.out.println("Test 3: " + java.util.Arrays.toString(obj.front11(new int[]{}, new int[]{})));
    }
    /**
     * Goal: Given two integer arrays 'a' and 'b', return a new array containing 
     * the first element from each array that is not empty.
     */
    public int[] front11(int[] a, int[] b) {
        // STEP 1: Determine the size of the result array.
        // Since we only take the first element from each array IF they exist,
        // the final array size can only be 0, 1, or 2.
        int count = 0;
        
        // We check if array 'a' has at least one element.
        // If it does, we'll take one element from it later.
        if(a.length > 0) {
            count++;
        }
        
        // We do the same check for array 'b'.
        // This ensures our result array is exactly the right size (no extra zeros).
        if(b.length > 0) {
            count++;
        }
        
        // STEP 2: Create the result array.
        // We use the 'count' we just calculated to initialize the array.
        int[] result = new int[count];
        
        // STEP 3: Fill the result array.
        // We use 'i' as a pointer to know which slot in 'result' to fill next.
        int i = 0;
        
        // If 'a' has elements, we grab the very first one (index 0).
        if(a.length > 0) {
            result[i] = a[0];
            // After adding an element, we MUST increment 'i' 
            // so the next element (from 'b') doesn't overwrite it.
            i++;
        }
        
        // If 'b' has elements, we grab its first one (index 0).
        if(b.length > 0){
            // This will go into result[0] if 'a' was empty, 
            // OR into result[1] if 'a' already added an element.
            result[i] = b[0];
            // We increment 'i' just to be safe, though it's the last step.
            i++;
        }
        
        // Finally, return the completed array.
         return result;
    }
}
