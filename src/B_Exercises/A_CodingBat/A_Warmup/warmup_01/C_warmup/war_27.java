package B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_27 {
    public static void main(String[] args) {

    }
    public String frontBack(String str){
        if (str.length() == 1){
            return str;
        }
        char first = str.charAt(0);
        char end = str.charAt(str.length()-1);
        String knew = str.substring(1,str.length()-1);

        return "" + end +knew + first;

    }
}
