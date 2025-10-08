package B_Coding_Exercise.C_Ex;

public class Ex_23 {
    public static void main(String[] args) {


        System.out.println(isPerfectNumber(5));

    }


    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
            if(sum == number){
                return true;
            }

        }
        return false;
    }
}
