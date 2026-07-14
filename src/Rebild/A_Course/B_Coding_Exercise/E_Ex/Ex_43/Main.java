package Rebild.A_Course.B_Coding_Exercise.E_Ex.Ex_43;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arry = {1,2,3,4,5,6};


        System.out.println("Berfor reverse: " + Arrays.toString(arry));

       reverse(arry);

        System.out.println("After reverse: " + Arrays.toString(arry));
    }

    private static void reverse(int [] array) {

        System.out.println("Array: = " + Arrays.toString(array) );


        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++)
        {

            int temp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
        }

        System.out.println("Reversed arry = " + Arrays.toString(array));

    }
}
