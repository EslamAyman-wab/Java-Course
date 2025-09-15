package B_Coding_Exercise;

public class Ex_03 {
    //Accurate MegaBytes Converter For Mastering Integer Math In Java
    public static void main(String[] args) {

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int x = kiloBytes;
        int y = x /1024;
        int r = x % 1024;

        System.out.println(x + " KB = " + y +" MB and "+ r+  " KB" );

    }
}
