package B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_25 {
    public static void main(String[] args) {

    }

    public String front22(String str) {
        String first2 = str.substring(0, Math.min(2, str.length()));
        return first2 + str + first2;
    }
}
