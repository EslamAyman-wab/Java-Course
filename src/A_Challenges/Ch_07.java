package A_Challenges;

public class Ch_07 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println(i + " is divided by 3 and 5 ");
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("this is conunt of ther number that is divided by 3 and 5 = " + count);
        System.out.println("the sum on number that is divided by 3 and 5 = " + sum);
    }
}
