package B_Exercises.A_CodingBat.B_Array.A_Arrays;

public class arr_01 {
    public static void main(String[] args) {
        arr_01 obj = new arr_01();
        System.out.println(obj.firstLast6(new int[]{1, 2, 6})); // true
        System.out.println(obj.firstLast6(new int[]{6, 1, 2, 3})); // true
        System.out.println(obj.firstLast6(new int[]{13, 6, 1, 2, 3})); // false
    }
    public boolean firstLast6 (int[] nums){
        if (nums[0] ==6 || nums[nums.length-1] ==6){
            return true;
        }
        return false;
    }
}
