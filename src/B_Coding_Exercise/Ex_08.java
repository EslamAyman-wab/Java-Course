package B_Coding_Exercise;

public class Ex_08 {
    //Devising A Teen Number Checker For Mastery Of Conditional Range Checking
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 139));
    }

    public static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }


}
