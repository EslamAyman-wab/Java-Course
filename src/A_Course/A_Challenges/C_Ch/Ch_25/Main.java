package A_Course.A_Challenges.C_Ch.Ch_25;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers?");
        int count = scanner.nextInt();

        int sum = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            list.add(number);
            sum += number;
            if(number %2 ==0){
                even +=number;
            } else {
                odd+=number;
            }
        }

        System.out.println("Numbers entered: " + list);
        System.out.println("the sum of the numbers = " + sum);
        System.out.println("The evens = " + even);
        System.out.println("The odd = " + odd);


    }
}
