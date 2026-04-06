package B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_26 {
    public static void main(String[] args) {

    }
    public String front3(String str) {
        String first3 = str.substring(0, Math.min(3, str.length()));
        return first3 + first3 + first3;
    }
}
