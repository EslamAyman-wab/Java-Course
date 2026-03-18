package B_Exercises.A_CodingBat.B_Array.C_Arrays;

public class arr_23 {
    public static void main(String[] args) {
        arr_23 solver = new arr_23();

        // Test 1
        int[] result1 = solver.midThree(new int[]{1, 2, 3, 4, 5});
        printResult(result1); // Expected: [2, 3, 4]

        // Test 2
        int[] result2 = solver.midThree(new int[]{8, 6, 7, 5, 3, 0, 9});
        printResult(result2); // Expected: [7, 5, 3]

        // Test 3
        int[] result3 = solver.midThree(new int[]{1, 2, 3});
        printResult(result3); // Expected: [1, 2, 3]
    }

    private static void printResult(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
    public int[] midThree(int[] nums) {
        int mid = nums.length/2;
        return new int[] {nums[mid-1], nums[mid], nums[mid+1]};

    }

}
