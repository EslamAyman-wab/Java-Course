package A_Challenges;

public class Ch_05 {
    public static void main(String[] args) {

        for (double i = 7.5; i <= 10;i= i+0.25){
            double interstamount= clac(100, i);
            System.out.println("100 at "+ i + "% interest = " + interstamount);
        }
    }

    public static double clac (double amoutn , double rate){

        return (amoutn * (rate / 100));
    }
}
