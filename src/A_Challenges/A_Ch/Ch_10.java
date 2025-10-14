package A_Challenges.A_Ch;

import java.util.Scanner;

public class Ch_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int sum = 0;
        while (i<=5){
            System.out.println("Enter number # " + i);
            String number = sc.nextLine();

            try {
                int y = Integer.parseInt(number);
                i++;
                sum += y;

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }

        }
        System.out.println("The sum of the number = " + sum);


    }
}
