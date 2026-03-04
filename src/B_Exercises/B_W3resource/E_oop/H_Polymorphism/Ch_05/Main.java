package B_Exercises.B_W3resource.E_oop.H_Polymorphism.Ch_05;
public class Main {

    public static void main(String[] args) {

        Sports football = new Football();  // Create an instance of the Football class
        Sports basketball = new Basketball();  // Create an instance of the Basketball class
        Sports rugby = new Rugby();  // Create an instance of the Rugby class

        football.play();  // Call the play method on the Football instance
        basketball.play();  // Call the play method on the Basketball instance
        rugby.play();  // Call the play method on the Rugby instance


    }
}