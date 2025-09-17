package A_Challenges;

public class Ch_02 {
    public static void main(String[] args) {

        System.out.println(getDurationString(3665)); // Output: 1 hh 1 mm 5 ss

        System.out.println(getDurationString(65, 45)); // 1 hh 5 mm 45 ss

    }

    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            return "Invalid";
        }

        int hh = seconds / 3600;          // hours
        int mm = (seconds % 3600) / 60;   // minutes
        int ss = seconds % 60;            // seconds

        return String.format("%02d hh %02d mm %02d ss", hh, mm, ss);
    }

    public static String getDurationString(int mm, int ss) {
        if (mm < 0) {
            return "Invalid";
        }
        if (ss < 0 || ss > 59) {
            return "Invalid";
        }

        // اجمالي الثواني = الدقايق بالثواني + الثواني
        int totalSeconds = (mm * 60) + ss;

        // استدعاء الدالة الاولى باستخدام اجمالي الثواني
        return getDurationString(totalSeconds);
    }


}
