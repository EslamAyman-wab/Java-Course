package A_Challenges.A_Ch;

public class Ch_03 {
    public static void main(String[] args) {

        char nato = 'A';

        switch (nato) {

            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.printf("invalid = %s%n", nato);
        }


    }
}
