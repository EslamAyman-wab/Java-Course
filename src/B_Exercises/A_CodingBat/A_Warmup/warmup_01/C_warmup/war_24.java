package B_Exercises.A_CodingBat.A_Warmup.warmup_01.C_warmup;

public class war_24 {
    public static void main(String[] args) {
        war_24 solver = new war_24();

        check(solver.startOz("ozymandias"), "oz", "test 1");
        check(solver.startOz("bzoo"), "z", "test 2");
        check(solver.startOz("oxx"), "o", "test 3");
        check(solver.startOz("abc"), "", "test 4");
        check(solver.startOz(""), "", "test 5");

        System.out.println("All 5 tests passed.");
    }

    /*
     * Easy idea:
     * 1. Start with an empty result.
     * 2. If the first letter is 'o', add it.
     * 3. If the second letter is 'z', add it.
     * 4. Return what was collected.
     */
    public String startOz(String str) {
        String result = "";
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'o') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += str.charAt(1);
        }
        return result;
    }

    private static void check(String actual, String expected, String testName) {
        if (!actual.equals(expected)) {
            throw new AssertionError(
                    testName + " failed: expected \"" + expected + "\" but got \"" + actual + "\""
            );
        }
    }
}
