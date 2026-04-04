package B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_21 {
    public static void main(String[] args) {

    }

    public boolean loneTeen(int a, int b) {
        boolean aInRange = (a >= 13 && a <= 19);
        boolean bInRange = (b >= 13 && b <= 19);
        if (aInRange && bInRange) {
            return false;
        }
        if (aInRange) {
            return true;
        }
        if (bInRange) {
            return true;
        }

        return false;
    }
}

