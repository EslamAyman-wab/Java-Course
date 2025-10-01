package A_Challenges;

public class Ch_06 {
    public static void main(String[] args) {

        int conuntPrime = 0;
        int sumPrime = 0;

        for (int i = 0; i <= 1000; i++) {
            boolean loop = isPrime(i);

            System.out.println(i + " is a " + (loop ? " prime" : " not"));
            if (loop) {
                conuntPrime++;
                sumPrime += i;
            }
//            if (conuntPrime == 3) {
//                break;
//            }

        }
        System.out.println("The Prime number from 0 to 1000 = " + conuntPrime + " And the sum of prime number = " + sumPrime);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
