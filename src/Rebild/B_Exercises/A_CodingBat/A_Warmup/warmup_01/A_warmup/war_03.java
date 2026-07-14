package Rebild.B_Exercises.A_CodingBat.A_Warmup.warmup_01.A_warmup;

public class war_03 {
    public static void main(String[] args) {
        // App Testing Code
        war_03 app = new war_03();
        System.out.println("SumDouble(1, 2) -> Expected: 3 | Result: " + app.sumDouble(1, 2));
        System.out.println("SumDouble(2, 2) -> Expected: 8 | Result: " + app.sumDouble(2, 2));
    }
    
    // Logic: Simple sum of two numbers.
    // Special rule: if a and b are the same, return twice the sum (sum * 2).
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if(a == b){
            return sum * 2;
        }
        return a + b;
    }
}
