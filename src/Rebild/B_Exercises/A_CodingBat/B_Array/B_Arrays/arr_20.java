package Rebild.B_Exercises.A_CodingBat.B_Array.B_Arrays;

public class arr_20 {
    public static void main(String[] args) {
        arr_20 obj = new arr_20();
        System.out.println(obj.unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(obj.unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(obj.unlucky1(new int[]{1, 1, 1}));
    }
    public boolean unlucky1(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        return ((nums[0] ==1  &&nums[1] == 3) ||(nums.length > 2 && nums[1] == 1 && nums[2] == 3) || (nums[nums.length-2] ==1  && nums[nums.length-1] == 3) );
    }
}
