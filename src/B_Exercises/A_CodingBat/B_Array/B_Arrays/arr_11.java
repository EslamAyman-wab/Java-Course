package B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_11 {
    public static void main(String[] args) {
        arr_11 obj = new arr_11();
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{8, 6, 7, 9, 5})));
    }

    public int[] swapEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];

        nums[0] = last;
        nums[nums.length - 1] = first;

        return nums;

    }

}
