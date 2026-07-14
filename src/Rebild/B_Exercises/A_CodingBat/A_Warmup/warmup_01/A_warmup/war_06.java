package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.A_warmup;

public class war_06 {
    public static void main(String[] args) {
        // App Testing Code
        war_06 app = new war_06();
        System.out.println("In1020(12, 99) -> Expected: true | Result: " + app.in1020(12, 99));
        System.out.println("In1020(8, 99) -> Expected: false | Result: " + app.in1020(8, 99));
    }

    // Logic: Checks if at least one of the numbers is within the range [10, 20].
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
