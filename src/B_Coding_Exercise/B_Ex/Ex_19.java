package B_Coding_Exercise.B_Ex;

public class Ex_19 {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(15, 5));


    }

    public static boolean hasSharedDigit(int a, int b) {
        // تحقق إن الرقمين في المدى من 10 إلى 99
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            // نفصل العشرات والوحدات ونقارن كل تركيبة ممكنة
            if ((a / 10 == b / 10) || (a / 10 == b % 10) ||
                    (a % 10 == b / 10) || (a % 10 == b % 10)) {
                return true;
            }
        }
        // لو الرقمين خارج المدى أو مافيش رقم مشترك
        return false;
    }


}
