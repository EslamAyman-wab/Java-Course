package B_Coding_Exercise.A_Ex;

public class Ex_04 {
    //Developing A 'Barking Dog' Program For Boolean Logic Familiarity
    public static void main(String[] args) {


    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // First, check for invalid hours
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // The dog must be barking AND it must be before 8 or after 10pm (22)
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
