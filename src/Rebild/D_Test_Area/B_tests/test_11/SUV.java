package Rebild.D_Test_Area.B_tests.test_11;

public class SUV extends Car{
    @Override
    void autopilot() {
        System.out.println("SUV autopilot");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV streamingServices");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV parkingSensors");
    }
}
