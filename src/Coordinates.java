public class Coordinates {
    public double x_coordinate;
    public double y_coordinate;

    public Coordinates(double x, double y){
        x_coordinate = x;
        y_coordinate = y;
    }

    @Override
    public String toString() {
        return "(" + x_coordinate + ", " + y_coordinate+")";
    }
}
