package B_Exercises.A_CodingBat.B_Array.B_Arrays;

import java.util.Arrays;

public class arr_18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeEnds(new int[] {1, 2, 3}))); // [1, 3]
        System.out.println(Arrays.toString(makeEnds(new int[] {1, 2, 3, 4}))); // [1, 4]
        System.out.println(Arrays.toString(makeEnds(new int[] {7, 4, 6, 2}))); // [7, 2]
        System.out.println(Arrays.toString(makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 3}))); // [1, 3]
        System.out.println(Arrays.toString(makeEnds(new int[] {7, 4}))); // [7, 4]
        System.out.println(Arrays.toString(makeEnds(new int[] {7}))); // [7, 7]
        System.out.println(Arrays.toString(makeEnds(new int[] {5, 2, 9}))); // [5, 9]
        System.out.println(Arrays.toString(makeEnds(new int[] {2, 3, 4, 1}))); // [2, 1]

    }

    public static int[] makeEnds(int[] nums){
        return new int[] {nums[0], nums[nums.length - 1]};
    }
}
