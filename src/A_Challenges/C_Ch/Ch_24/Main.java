package A_Challenges.C_Ch.Ch_24;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arry = {1,2,3,4,5,6};


        System.out.println("Berfor reverse: " + Arrays.toString(arry));

        reverse(arry);

        System.out.println("After reverse: " + Arrays.toString(arry));
    }

    public static void reverse(int [] array) {


        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++)
        {

            int temp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
        }

    }
}
