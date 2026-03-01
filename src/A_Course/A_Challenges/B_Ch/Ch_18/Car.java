package A_Course.A_Challenges.B_Ch.Ch_18;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("The Engine is Started ");

    }

    public void drive (){
        System.out.println("You are Driving");
    }

    protected void runEngine(){
        System.out.println("The Engine is runing ");
    }

    public String getDescription() {
        return description;
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private  int cyliners;

    public GasPoweredCar(String description, double avgKmPerLitre, int cyliners) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cyliners = cyliners;
    }

    @Override
    public void startEngine() {
        System.out.println("The engin runing with Gas");
    }

    @Override
    public void drive() {
        System.out.println("The car is gas");
    }

    @Override
    protected void runEngine() {
        System.out.println("The engine is runing with gas");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCyliners() {
        return cyliners;
    }
}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        System.out.println("The engin runing with batter");
    }

    @Override
    public void drive() {
        System.out.println("The car is electric");
    }

    @Override
    protected void runEngine() {
        System.out.println("The engine is runing with eletric");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}

class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterSize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterSize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterSize = batterSize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println("The engin runing with hybrid");
    }

    @Override
    public void drive() {
        System.out.println("The car is hybrid");
    }

    @Override
    protected void runEngine() {
        System.out.println("The engine is runing with hybird");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterSize() {
        return batterSize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
