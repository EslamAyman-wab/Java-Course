package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.A_warmup;

public class war_05 {
    public static void main(String[] args) {
        // App Testing Code
        war_05 app = new war_05();
        System.out.println("IcyHot(120, -1) -> Expected: true | Result: " + app.icyHot(120, -1));
        System.out.println("IcyHot(2, 120) -> Expected: false | Result: " + app.icyHot(2, 120));
    }

    // Logic: Returns true if one number is below zero (cold) 
    // AND the other is above 100 (hot).
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}
