package A_Challenges.A_Ch;

public class Ch_01 {
    public static void main(String[] args) {

        System.out.println("From inch to cm = " + convertToCentimeters(68) + " cm");

        System.out.println("From feet and inch to cm =" + convertToCentimeters(5, 8) + "cm");

    }

    public static double convertToCentimeters(int height_inch) {

        double inch_toCem = height_inch * 2.54;

        return inch_toCem;
    }

    public static double convertToCentimeters(int height_feet, int height_inchs) {

        int feet_toinch = height_feet * 12;


        return (convertToCentimeters(feet_toinch)) + (convertToCentimeters(height_inchs));
    }
}
