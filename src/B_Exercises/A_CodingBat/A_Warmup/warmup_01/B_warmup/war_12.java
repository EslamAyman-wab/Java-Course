package B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_12 {
    public static void main(String[] args) {

    }

    public int close10(int a, int b) {

        int x = Math.abs(a - 10);
        int y = Math.abs(b - 10);

        if (x > y) {
            return b;
        }
        if (y > x) {
            return a;
        }
        return 0;
    }

}
