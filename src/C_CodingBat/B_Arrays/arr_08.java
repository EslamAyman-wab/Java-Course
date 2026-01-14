package C_CodingBat.B_Arrays;

public class arr_08 {
    public static void main(String[] args) {

        int[][] tests = {
                {4, 5},   // true
                {2, 5},   // false
                {5, 3},   // false
                {2, 3},   // false
                {7, 8},   // true
                {3, 2}    // false
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println(
                    "Test " + (i + 1) +
                            " " + java.util.Arrays.toString(tests[i]) +
                            " -> " + no23(tests[i])
            );
        }
    }

    public static boolean no23(int[] nums) {
        if(nums[0] ==2 || nums[1] == 3|| nums[0]==3|| nums[1]==2){
            return false;
        }
        return true;
    }

}
