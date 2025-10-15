package B_Coding_Exercise.C_Ex;

import java.util.Scanner;

public class Ex_29 {
    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int AVG = 0;

        while (true) {
            System.out.println("Enter a number : ");
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int validNum = sc.nextInt();
                sum += validNum;
                AVG++;

            } else {
                break;
            }
        }
        long roundedAverage = 0;
        if (AVG > 0) {
            double average = (double) sum / AVG;
            roundedAverage = Math.round(average);
        }

        System.out.println("SUM = " + sum + " AVG = " + roundedAverage);
        sc.close();
    }
}
