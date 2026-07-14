package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_23 {
    public static void main(String[] args) {

    }

    public boolean hasTeen(int a , int b, int c){
        boolean aInRange = (a >= 13 && a <= 19);
        boolean bInRange = (b >= 13 && b <= 19);
        boolean cInRange = (c >= 13 && c <= 19);

        return (aInRange || bInRange|| cInRange);
    }
}
