package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_31 {
    public static void main(String[] args) {

    }
    public String everyNth(String str, int n) {
        String result = "";
        for(int i = 0; i < str.length(); i += n){
        result += str.charAt(i);
        }
        return result;
    }     

}

//StringBuilder result = new StringBuilder();
//for(int i = 0; i < str.length(); i += n){
//        result.append(str.charAt(i)); // يضيف للصندوق مباشرة
//        }
//        return result.toString(); // يحوله لـ String