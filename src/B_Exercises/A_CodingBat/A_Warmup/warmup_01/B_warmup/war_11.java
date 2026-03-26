package B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_11 {

    public static void main(String[] args) {


    }

    boolean isInRange(int value, int min, int max) {

        return (value >= min && value <= max);

    }

    public boolean in3050(int a, int b) {

//        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));

        return isInRange(a,30,40) && isInRange(b,30,40) ||
                isInRange(b,40,50) && isInRange(b,40,50);

    }


}
