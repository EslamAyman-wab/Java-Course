package A_Challenges.B_Ch;

import java.util.Scanner;

public class Ch_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopConut = 0;

        while (true) {
            System.out.println("Enter a number , or any character to exit: ");
            String nextEntry = sc.nextLine();

            try {
                double valildNum = Double.parseDouble(nextEntry);
                if (loopConut == 0 || valildNum < min){
                    min = valildNum;
                }
                if (loopConut == 0|| valildNum > max){
                    max = valildNum;
                }
                loopConut++;

            } catch (NumberFormatException nfe){
                break;
            }



        }
        if (loopConut > 0){
            System.out.println("min = " + min + " , max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
