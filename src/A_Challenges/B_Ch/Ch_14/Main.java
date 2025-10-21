package A_Challenges.B_Ch.Ch_14;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            test s = new test("S19000" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Eslam";
                        case 5 -> "Ayman";
                        default -> "Anonymous";
                    },
                    "23/7/2002", "Java and js");

            System.out.println(s);
        }
    }

}
