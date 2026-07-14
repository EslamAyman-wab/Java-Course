package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_28 {
    public static void main(String[] args) {

    }

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        boolean mix = str.charAt(1) == 'i' && str.charAt(2) == 'x';

        return mix;
    }
}
