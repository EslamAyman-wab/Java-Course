package D_Test_Area.Test_09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,55,56,-3,52,32,19};
        int min = arr[0];
        int max = arr[0];                                                                                          
        for (int i : arr) {
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        Arrays.sort(arr);
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
    }
}
