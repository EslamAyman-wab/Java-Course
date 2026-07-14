package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_22 {
    public static void main(String[] args) {

    }

    public String delDel(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);        }

        return str;
    }
}
