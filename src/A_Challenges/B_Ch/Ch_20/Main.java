package A_Challenges.B_Ch.Ch_20;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] randomArray = getRendomArray();
        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println("The sum of the array elements is: " + Arrays.stream(randomArray).sum());


        int [] reversarry = getRendomArray();
        System.out.println(Arrays.toString(reversarry));

        reverseArray(reversarry);

        System.out.println(Arrays.toString(reversarry));
        System.out.println("The sum of the array elements is: " + Arrays.stream(reversarry).sum());

    }
    private static int [] getRendomArray(){



        int sum = 0;
        Random random = new Random();
        int [] newInt = new int [10];

        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);// Generates a random integer between 0 and 99
            sum += newInt[i];
        }

        return newInt;
    }

    private static void reverseArray(int[] array) {

        int lastindex = array.length - 1;
        for (int i =0 ; i < array.length/2 ; i++) {

            int temp = array[i];
            array[i] = array[lastindex - i];
            array[lastindex - i] = temp;
        }
    }


    }
