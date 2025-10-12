package B_Coding_Exercise.C_Ex;

public class Ex_27 {
    public static void main(String[] args) {
        printSquareStar(5);


    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number ||
                        col == 1 || col == number ||
                        row == col ||
                        col == number - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // ← دي اللي تنقلك للسطر الجديد بعد كل صف
        }


    }

}
