package A_Course.A_Challenges.B_Ch.Ch_17;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplux;

    public Printer(int tonerLevel, boolean duplux) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplux = duplux;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;

        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
//        if (duplux) {
//            return (pages / 2) + (pages % 2);// handles odd page counts too
//        }
//        return pages;

        int jobPages = (duplux) ? (pages / 2) + (pages % 2) : pages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
