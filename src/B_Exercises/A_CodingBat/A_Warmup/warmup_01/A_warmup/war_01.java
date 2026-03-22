package B_Exercises.A_CodingBat.A_Warmup.warmup_01.A_warmup;

public class war_01 {
    public static void main(String[] args) {
        // App Testing Code
        war_01 app = new war_01();
        System.out.println("SleepIn(false, false) -> Expected: true | Result: " + app.sleepIn(false, false));
        System.out.println("SleepIn(true, false) -> Expected: false | Result: " + app.sleepIn(true, false));
        System.out.println("SleepIn(false, true) -> Expected: true | Result: " + app.sleepIn(false, true));
    }
    
    // Logic: We sleep in if it's NOT a weekday or if we ARE on vacation.
    // The "!" operator flips the boolean (true to false, false to true).
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
