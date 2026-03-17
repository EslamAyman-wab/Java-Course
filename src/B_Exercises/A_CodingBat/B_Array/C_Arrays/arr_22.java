package B_Exercises.A_CodingBat.B_Array.C_Arrays;

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
    public int[] front11(int[] a, int[] b) {
        // Create a counter to track how many elements will be in our final array
        int count = 0;
        
        // If the first array 'a' has at least one element, we will take one, so increment count
        if(a.length > 0) count++;
        
        // If the second array 'b' has at least one element, we will take one, so increment count
        if(b.length > 0) count++;
        
        // Initialize the result array with the size we just calculated (0, 1, or 2)
        int[] result = new int[count];
        
        // This index 'i' will help us place elements into the result array one by one
        int i = 0;
        
        // Check if array 'a' is not empty
        if(a.length > 0) {
            // Take the first element of 'a' and put it in the first available slot in result
            result[i] = a[0];
            // Move the index to the next slot in result
            i++;
        }
        
        // Check if array 'b' is not empty
        if(b.length > 0){
            // Take the first element of 'b' and put it in the current slot in result
            result[i] = b[0];
            // No need to increment 'i' here as it's the last possible element
            i++;
        }
        
        // Return the newly created array containing the first elements
         return result;
    }
}
