package A_Challenges.A_Ch;

public class Ch_04 {
    public static void main(String[] args) {

        printDayOfWeek(3);


    }

    public static void  printDayOfWeek (int day){

       String dayOfweek = switch (day){
           case 0 -> "sun";


           default -> "INvalid Day";
       };
    }
}
