package A_Challenges.B_Ch.Ch_15;

public class Worker {

    private String name;
    private String BirthDate;
    protected String EndDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        BirthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(BirthDate.substring(6));
        return (currentYear - birthYear);
    }

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
