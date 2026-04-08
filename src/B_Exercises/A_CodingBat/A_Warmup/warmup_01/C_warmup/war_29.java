package B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_29 {
    public static void main(String[] args) {



    }
    public String endUp(String str){
        if(str.length() <= 2){
            return str.toUpperCase();
        }
        String last3 =  str.substring(str.length()-3);
       String  first = str.substring(0,str.length()-3);
       return  first +  last3.toUpperCase();
    }
}
