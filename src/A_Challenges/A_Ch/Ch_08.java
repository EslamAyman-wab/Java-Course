package A_Challenges.A_Ch;

public class Ch_08 {
    public static void main(String[] args) {

        int start = 4;
        int endt = 20;

        int sumeven = 0;
        int counteven = 0;

        int sumodd = 0;
        int countodd = 0;


        while (start <= endt) {
            start++;
            if (!isEvenNumber(start)) {
                countodd++;
                sumodd += start;
                continue;
            }
            counteven++;
            if (counteven == 5) {
                break;
            }
            sumeven += start;
//            System.out.println(start + "_");


        }
            System.out.println("The sum of even number = " + sumeven + " The conunt of even = " + counteven);
            System.out.println("The sum of odd = " + sumodd + " The conunt of odd = " + countodd);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
