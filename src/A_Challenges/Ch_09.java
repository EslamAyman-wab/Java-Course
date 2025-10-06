package A_Challenges;

public class Ch_09 {
    public static void main(String[] args) {

        System.out.println("The sum of Digits = " + sumDigits(1234));


    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
