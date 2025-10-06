package B_Coding_Exercise.B_Ex;

public class Ex_16 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));

    }


    // This method checks if a given number is a palindrome.
    // A palindrome reads the same backward and forward (e.g., 121, 454, 9009).
    public static boolean isPalindrome(int number) {

        int reverse = 0;          // This variable will store the reversed version of the number.
        int original = number;    // We keep a copy of the original number because we’ll modify it.

        // Loop until we've processed all digits
        while (original != 0) {
            int lastDigit = original % 10;      // Extract the last digit (e.g., 123 % 10 = 3)
            reverse = reverse * 10 + lastDigit; // Add it to the reversed number (e.g., 0*10 + 3 = 3, then 3*10 + 2 = 32)
            original /= 10;                     // Remove the last digit from the original (e.g., 123 / 10 = 12)
        }

        // Compare the reversed number with the original input.
        // If they're the same, it means the number is a palindrome.
        return reverse == number;
    }
}


