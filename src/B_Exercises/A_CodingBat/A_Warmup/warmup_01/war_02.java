package B_Exercises.A_CodingBat.A_Warmup.warmup_01;

public class war_02 {
    public static void main(String[] args) {
        // App Testing Code
        war_02 app = new war_02();
        System.out.println("MonkeyTrouble(true, true) -> Expected: true | Result: " + app.monkeyTrouble(true, true));
        System.out.println("MonkeyTrouble(false, false) -> Expected: true | Result: " + app.monkeyTrouble(false, false));
        System.out.println("MonkeyTrouble(true, false) -> Expected: false | Result: " + app.monkeyTrouble(true, false));
    }
    
    // Logic: Trouble happens if both monkeys are in the same state.
    // That means (aSmile AND bSmile) OR (NOT aSmile AND NOT bSmile).
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile ){
            return true;
        }
        if (!aSmile && !bSmile){
            return true;
        }
        return false;
    }
}
