package B_Coding_Exercise.C_Ex;

public class Ex_26 {
    public static void main(String[] args) {

    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 0;

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                number = number / i;
                largestPrime = i;

            }
        }
        if (number > 1) {
            largestPrime = number;
        }


        return largestPrime;
    }
}
