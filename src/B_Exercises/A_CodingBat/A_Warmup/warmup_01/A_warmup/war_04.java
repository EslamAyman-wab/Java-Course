package B_Exercises.A_CodingBat.A_Warmup.warmup_01.A_warmup;

public class war_04 {
    public static void main(String[] args) {
        // App Testing Code
        war_04 app = new war_04();
        System.out.println("Diff21(19) -> Expected: 2 | Result: " + app.diff21(19));
        System.out.println("Diff21(25) -> Expected: 8 | Result: " + app.diff21(25));
    }
    
    // Logic: Calculates how far n is from 21.
    // If n is larger than 21, the absolute difference is doubled.
    public int diff21(int n) {
        if (n > 21){
            return Math.abs(n - 21) * 2;
        } else {
            return Math.abs(n - 21);
        }
    }
}
