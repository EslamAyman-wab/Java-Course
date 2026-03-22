package B_Exercises.A_CodingBat.A_Warmup.warmup_01;

public class war_09 {
    public static void main(String[] args) {
        // App Testing Code
        war_09 app = new war_09();
        System.out.println("PosNeg(1, -1, false) -> Expected: true | Result: " + app.posNeg(1, -1, false));
        System.out.println("PosNeg(-4, -5, true) -> Expected: true | Result: " + app.posNeg(-4, -5, true));
    }

    // Logic: If 'negative' flag is true, both a and b must be < 0.
    // If 'negative' flag is false, signs must be different (a*b < 0).
    public boolean posNeg(int a, int b, boolean negative) {
        return (negative && a < 0 && b < 0) || (!negative && (long)a * b < 0);    
    }
}
