package Rebild.A_Course.A_Challenges.C_Ch.Ch_29;

public class Point implements Mappable {
    double x;
    double y;
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void render () {
        System.out.printf ("%f,%f\n", x, y);
    }
}

class Line implements Mappable {
    double [] []  points;
    public Line (double [] [] points) {
        this.points = points;
    }
    @Override
    public void render () {
        System.out.printf ("%f,%f\n", points[0][0], points[0][1]);
    }
}
