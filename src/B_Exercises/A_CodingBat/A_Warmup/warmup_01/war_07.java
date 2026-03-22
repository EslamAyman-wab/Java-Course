package B_Exercises.A_CodingBat.A_Warmup.warmup_01;

public class war_07 {
    public static void main(String[] args) {
        // App Testing Code
        war_07 app = new war_07();
        System.out.println("Makes10(9, 10) -> Expected: true | Result: " + app.makes10(9, 10));
        System.out.println("Makes10(1, 9) -> Expected: true | Result: " + app.makes10(1, 9));
        System.out.println("Makes10(8, 3) -> Expected: false | Result: " + app.makes10(8, 3));
    }

    // Logic: True if either value is 10 or if their combined sum equals 10.
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }
}
