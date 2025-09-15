package B_Coding_Exercise;

public class Ex_02 {
    //Implementing A Speed Converter To Practice Basic Java Arithmetic And Output
    public static void main(String[] args) {

    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour)+ " mi/h" );

    }
}
