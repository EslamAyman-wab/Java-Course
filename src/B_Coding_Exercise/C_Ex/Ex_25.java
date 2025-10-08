package B_Coding_Exercise.C_Ex;

public class Ex_25 {
    public static void main(String[] args) {

        System.out.println(canPack(1,0,6));


    }

    public static boolean canPack (int bigCount , int smallCount , int goal){

        if( bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int maxBigBags = goal / 5;

        int theBig = Math.min(bigCount,maxBigBags);

        int finall = (goal- (theBig * 5));

        return smallCount >= finall;
    }
}
