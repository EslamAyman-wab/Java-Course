package B_Coding_Exercise.B_Ex;

public class Ex_12 {
    //Designing A 'Playing Cat' Logic Program To Refine Conditional Implementation
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
