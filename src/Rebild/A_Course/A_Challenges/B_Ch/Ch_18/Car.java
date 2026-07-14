package Rebild.A_Course.A_Challenges.B_Ch.Ch_18;

/**
 * **Car** is the BASE class (Superclass).
 * It defines the basic blueprint for all types of cars.
 */
public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    /**
     * Polymorphism in action: This method can be overridden by subclasses.
     */
    public void startEngine(){
        System.out.println("Car: The Engine is Started ");
    }

    public void drive (){
        System.out.println("Car: You are Driving");
    }

    protected void runEngine(){
        System.out.println("Car: The Engine is runing ");
    }

    public String getDescription() {
        return description;
    }
}

/**
 * **GasPoweredCar** is a Book that provides its own specific behavior.
 */
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
        System.out.println("Gas Car: Starting with the sound of internal combustion!");
    }

    @Override
    public void drive() {
        System.out.println("Gas Car: Driving using fuel from the tank.");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas Car: Engine is burning fuel.");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCyliners() {
        return cyliners;
    }
}

/**
 * **ElectricCar** is another Book with different behavior.
 */
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
        System.out.println("Electric Car: Starting silently... just a hum!");
    }

    @Override
    public void drive() {
        System.out.println("Electric Car: Driving using electric power.");
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric Car: Motor is spinning using battery energy.");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}

/**
 * **HybridCar** combines behaviors from both gas and electric.
 */
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
        System.out.println("Hybrid Car: Starting with a mix of gas and battery!");
    }

    @Override
    public void drive() {
        System.out.println("Hybrid Car: Driving efficiently on both systems.");
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid Car: System is managing both engine and motor.");
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
