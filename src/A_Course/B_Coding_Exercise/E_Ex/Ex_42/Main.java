package A_Course.B_Coding_Exercise.E_Ex.Ex_42;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) اقرأ عدد العناصر
        int count = readInteger();
        System.out.println("Count = " + count);

        // 2) اقرأ العناصر
        int[] elements = readElements(count);
        System.out.println("Elements = " + Arrays.toString(elements));

        // 3) احسب أقل قيمة
        int min = findMin(elements);
        System.out.println("Min = " + min);


    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas:");

        int num = sc.nextInt();

        return num;

    }

    private static int[] readElements(int conunt) {
        Scanner scanner = new Scanner(System.in);

        int[] numbes = new int[conunt];
        for (int i = 0; i < conunt; i++) {
            numbes[i] = scanner.nextInt();
        }
        return numbes;
    }

    private static int findMin(int[] arry) {

        int min = Integer.MAX_VALUE;
        for (int el : arry) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
