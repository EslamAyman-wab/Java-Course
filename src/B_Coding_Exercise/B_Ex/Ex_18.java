package B_Coding_Exercise.B_Ex;

public class Ex_18 {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));


    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            if (number % 2 == 0) {

                sum += digit;
            }
            number /= 10;
        }


        return sum;
    }
}
