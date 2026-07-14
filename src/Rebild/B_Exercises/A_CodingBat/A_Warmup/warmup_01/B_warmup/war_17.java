package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_17 {
    public static void main(String[] args) {


    }

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return "" + last + str + last;
    }
}
