package D_Test_Area.Test_10;

public class Main {
    public static void main(String[] args) {
        int [][] arr ={
                {1,4,5,7},
                {3,4,6,23},
                {34,56,73}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int cal = 0; cal < arr[row].length; cal++) {
                System.out.print(arr[row][cal] + " ");
            }
            System.out.println();
        }
    }
}
