package B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_18 {
    public static void main(String[] args) {

    }

    public String missingChar(String str, int n) {
        //Part-1
        String x1 = str.substring(0, n);

        // Part-2
        String x2 = str.substring(n + 1);

        return  x1 + x2;
    }
}
