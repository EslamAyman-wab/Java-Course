package B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_14 {
    public static void main(String[] args) {

    }
    public String notString(String str) {

//        return str.startsWith("not") ? str : "not " + str;

        if (str.startsWith("not")) {
            return str;
        }
        return "not "+str;
    }

}
