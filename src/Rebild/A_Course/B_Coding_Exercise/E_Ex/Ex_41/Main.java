package Rebild.A_Course.B_Coding_Exercise.E_Ex.Ex_41;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

    }

    public static int [] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);


        int newInt[] = new int [size];
        for (int i = 0; i < newInt.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            newInt[i] = sc.nextInt();
        }
        return newInt;
    }

    public static int [] sortIntegers(int [] array) {

        int copyArr[] = Arrays.copyOf(array, array.length);

        Arrays.sort(copyArr);
        int lastIndex = copyArr.length - 1;
        for (int i = 0; i < copyArr.length / 2; i++)
        {

            int temp = copyArr[i];
            copyArr[i] = copyArr[lastIndex - i];
            copyArr[lastIndex - i] = temp;
        }

        return copyArr;
    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

}
