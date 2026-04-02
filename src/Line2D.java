public class Line2D {
    private double m;
    private double n;

    public Line2D(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public Line2D(Line2D other) {
        this.m = other.m;
        this.n = other.n;
    }

    public double getM() {
        return m;
    }

    public double getN() {
        return n;
    }

    @Override
    public String toString() {
        return "y = " + m + "x + " + n;
    }

    public boolean isParallel(Line2D other) {
        return this.m == other.m;
    }

    public Point2D intersection(Line2D other) {
        if (this.isParallel(other)) {
            return null;
        }

        double x = (other.n - this.n) / (this.m - other.m);
        double y = this.m * x + this.n;

        return new Point2D(x, y);
    }
}
