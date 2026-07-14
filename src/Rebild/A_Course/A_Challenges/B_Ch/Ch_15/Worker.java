package Rebild.A_Course.A_Challenges.B_Ch.Ch_15;

/**
 * **Worker** is the BASE class (Superclass).
 * It contains common fields that any person working might have.
 */
public class Worker {

    private String name;
    private String BirthDate;
    protected String EndDate; // 'protected' allows subclasses to access this field directly

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.BirthDate = birthDate;
    }

    /**
     * Calculates the age based on the birth date string.
     */
    public int getAge() {
        int currentYear = 2025;
        // Extracts the year from a "dd/mm/yyyy" string
        int birthYear = Integer.parseInt(BirthDate.substring(6));
        return (currentYear - birthYear);
    }

    /**
     * Placeholder method for collecting pay, to be overridden by subclasses.
     */
    public double callectPay() {
        return 0.00;
    }

    public void terminate(String EndDate) {
        this.EndDate = EndDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }
}
