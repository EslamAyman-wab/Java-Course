package B_Exercises.B_W3resource.F_Array.Ch_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = new int [10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        System.out.println("the arry numbers is " + Arrays.toString(arr)  );
        for (int i =0; i < arr.length; i++){
                sum = sum + arr[i];
        }
            System.out.println("The sum = "+ sum);
    }
}