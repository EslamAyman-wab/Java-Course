package Rebild.D_Test_Area.B_tests.test_12;

public class CarV1 implements Movable, SelfDrivable {

    private int x, y;
    int numberOfPassengers;

    public CarV1(){}
    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUP() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void destination(String d) {
        System.out.println("destination" + d);
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }
}
