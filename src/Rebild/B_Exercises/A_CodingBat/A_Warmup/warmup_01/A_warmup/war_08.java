package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.A_warmup;

public class war_08 {
    public static void main(String[] args) {
        // App Testing Code
        war_08 app = new war_08();
        System.out.println("NearHundred(93) -> Expected: true | Result: " + app.nearHundred(93));
        System.out.println("NearHundred(89) -> Expected: false | Result: " + app.nearHundred(89));
        System.out.println("NearHundred(197) -> Expected: true | Result: " + app.nearHundred(197));
    }

    // Logic: Uses Math.abs to find the distance of n from 100 and 200.
    // True if distance from 100 <= 10 or distance from 200 <= 10.
    public boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }
}
