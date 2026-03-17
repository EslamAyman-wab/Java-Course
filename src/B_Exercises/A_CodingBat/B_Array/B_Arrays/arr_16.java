package B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_16 {
    public static void main(String[] args) {
        arr_16 obj = new arr_16();
        System.out.println(obj.sum2(new int[]{1, 2, 3}));
        System.out.println(obj.sum2(new int[]{1, 1}));
        System.out.println(obj.sum2(new int[]{1, 1, 1, 1}));
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }
}
