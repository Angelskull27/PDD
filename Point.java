public class Point {
    private double x;
    private double y;
    public Point() {
        System.out.println("Desde el constructor");
        x = 0.0;
        y = 0.0;
    }
    void print() {
        System.out.println("Soy el punto " + x + " , " + y);
    }
}