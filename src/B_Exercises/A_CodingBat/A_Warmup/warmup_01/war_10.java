package B_Exercises.A_CodingBat.A_Warmup.warmup_01;

public class war_10 {
    public static void main(String[] args) {
        // App Testing Code
        war_10 app = new war_10();
        System.out.println("Or35(3) -> Expected: true | Result: " + app.or35(3));
        System.out.println("Or35(10) -> Expected: true | Result: " + app.or35(10));
        System.out.println("Or35(8) -> Expected: false | Result: " + app.or35(8));
    }

    // Logic: Uses modulo (%) to check if n is evenly divisible by 3 or 5.
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
}
