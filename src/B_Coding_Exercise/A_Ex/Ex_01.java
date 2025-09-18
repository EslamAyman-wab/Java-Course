package B_Coding_Exercise.A_Ex;

public class Ex_01 {
    //Comprehensive 'Positive, Negative, Or Zero' Assessment In Java
    public static void main(String[] args) {
        checkNumber(5);

    }
    public static void checkNumber (int number) {
        if(number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0 ) {
            System.out.println("zero");
        }
    }
}
