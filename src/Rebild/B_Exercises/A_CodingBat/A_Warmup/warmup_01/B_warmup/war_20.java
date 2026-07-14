package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_20 {
    public static void main(String[] args) {

    }

    public int max1020(int a, int b) {
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);
        if (!aInRange && !bInRange){
            return 0;
        } else if(!bInRange){
            return a;
        } else if (!aInRange){
            return b;
        }else
            return Math.max(a,b);
    }
}
