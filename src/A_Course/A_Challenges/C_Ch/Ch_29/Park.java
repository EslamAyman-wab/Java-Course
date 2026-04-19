package A_Course.A_Challenges.C_Ch.Ch_29;

public class Park extends Point {
    private String name;

    public Park(double x, double y, String name) {
        super(x, y);
        this.name = name;
    }
    @Override
    public void render() {
        System.out.printf ("%f,%f,%s\n", x, y, name);
    }
}

class River extends Line{
    private String name;

    public River(double[][] points, String name) {
        super(points);
        this.name = name;
    }
    
    @Override
    public void render() {
        for (double[] point : points) {
            System.out.printf ("%f,%f,%s\n", point[0], point[1], name);
        }
    }
    
}
