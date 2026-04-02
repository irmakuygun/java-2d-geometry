public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceTo(Point2D other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) +
                Math.pow(this.y - other.y, 2));
    }

    public double distanceTo(Line2D line) {
        double m = line.getM();
        double n = line.getN();

        return Math.abs(m * this.x - this.y + n) / Math.sqrt(m * m + 1);
    }
}
