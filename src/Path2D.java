import java.util.ArrayList;

public class Path2D {
    private ArrayList<Point2D> points;

    public Path2D() {
        points = new ArrayList<>();
    }

    public Path2D(Path2D other) {
        points = new ArrayList<>();
        for (Point2D p : other.points) {
            points.add(new Point2D(p));
        }
    }

    public Point2D getPoint(int index) {
        return points.get(index);
    }

    public void addPoint(Point2D p) {
        points.add(p);
    }

    public int size() {
        return points.size();
    }

    public double length() {
        double total = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            total += points.get(i).distanceTo(points.get(i + 1));
        }
        return total;
    }

    public Path2D combine(Path2D other) {
        Path2D newPath = new Path2D(this);

        for (Point2D p : other.points) {
            newPath.addPoint(new Point2D(p));
        }

        return newPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Point2D p : points) {
            sb.append(p.toString()).append(" === ");
        }
        return sb.toString();
    }
}
