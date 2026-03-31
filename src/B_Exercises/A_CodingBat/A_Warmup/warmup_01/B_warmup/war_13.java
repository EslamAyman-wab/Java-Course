package B_Exercises.A_CodingBat.A_Warmup.warmup_01.B_warmup;

public class war_13 {
    public static void main(String[] args) {
        war_13 testInstance = new war_13();

        // Test cases
        System.out.println("Testing stringE method:");
        System.out.println("stringE(\"Hello\"): " + testInstance.stringE("Hello")); // true, 1 'e'
        System.out.println("stringE(\"Heelle\"): " + testInstance.stringE("Heelle")); // true, 3 'e's
        System.out.println("stringE(\"Heeee\"): " + testInstance.stringE("Heeee")); // false, 4 'e's
        System.out.println("stringE(\"abc\"): " + testInstance.stringE("abc")); // false, 0 'e's
        System.out.println("stringE(\"e\"): " + testInstance.stringE("e")); // true, 1 'e'
        System.out.println("stringE(\"ee\"): " + testInstance.stringE("ee")); // true, 2 'e's
        System.out.println("stringE(\"eee\"): " + testInstance.stringE("eee")); // true, 3 'e's
        System.out.println("stringE(\"eeee\"): " + testInstance.stringE("eeee")); // false, 4 'e's
        System.out.println("stringE(\"\"): " + testInstance.stringE("")); // false, 0 'e's
    }
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'e') {
                count++;
            }

        }
        return (count >= 1 && count <= 3);
    }
    
}
