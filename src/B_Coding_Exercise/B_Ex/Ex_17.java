package B_Coding_Exercise.B_Ex;

public class Ex_17 {

    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigit(121));


    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }


        int lastdigit = number % 10;
        while (number >= 10) {
            number /= 10;

        }
        int sum =lastdigit + number;


        return sum;
    }
}
