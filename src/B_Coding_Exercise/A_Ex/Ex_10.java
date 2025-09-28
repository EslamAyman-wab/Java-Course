package B_Coding_Exercise.A_Ex;

public class Ex_10 {
    public static void main(String[] args) {
        printYearsAndDays(525600);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes / (60 * 24);  // نحول الدقايق إلى أيام
        long years = days / 365;          // عدد السنين
        long remainingDays = days % 365;  // الأيام المتبقية

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }

}
