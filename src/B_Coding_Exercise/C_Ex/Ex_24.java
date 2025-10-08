package B_Coding_Exercise.C_Ex;

public class Ex_24 {
    public static void main(String[] args) {

        System.out.println(getDigitCount(0));

        System.out.println(reverse(-1234));

        numberToWords(11);


    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int original = number;
        number = Math.abs(number); // نخلي الرقم موجب علشان نشتغل بسهولة
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        if (original < 0) {
            reverse *= -1;
        }
        return reverse;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int originalCount = getDigitCount(number);
        int reversed = reverse(number);
        int reversedCount = getDigitCount(reversed);

        while (reversed > 0) {
            int digit = reversed % 10;
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversed /= 10;
        }

        // طباعة الأصفار المفقودة فقط
        for (int i = 0; i < (originalCount - reversedCount); i++) {
            System.out.println("Zero");
        }
    }



}

