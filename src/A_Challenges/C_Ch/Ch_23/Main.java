package A_Challenges.C_Ch.Ch_23;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readInegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Min = " + returnedMin);
    }

    public static int[] readInegers() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas:");

        String input = sc.nextLine();

        String[] parts = input.split(",");

        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        return numbers;
    }

    public static int findMin(int[] num) {

        int min = Integer.MAX_VALUE;
        for (int el : num) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

}
