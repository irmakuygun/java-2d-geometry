public class Demo {
    public static void main(String[] args) {

        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(4, 6);

        System.out.println("Point1: " + p1);
        System.out.println("Point2: " + p2);
        System.out.println("Distance: " + p1.distanceTo(p2));

        Line2D l1 = new Line2D(2, 1);
        Line2D l2 = new Line2D(-1, 3);

        System.out.println("Line1: " + l1);
        System.out.println("Line2: " + l2);
        System.out.println("Parallel? " + l1.isParallel(l2));

        Point2D inter = l1.intersection(l2);
        System.out.println("Intersection: " + inter);

        System.out.println("Distance from p1 to line1: " + p1.distanceTo(l1));

        Path2D path = new Path2D();
        path.addPoint(p1);
        path.addPoint(p2);
        path.addPoint(new Point2D(7, 8));

        System.out.println("Path: " + path);
        System.out.println("Path size: " + path.size());
        System.out.println("Path length: " + path.length());

        Path2D path2 = new Path2D();
        path2.addPoint(new Point2D(10, 10));

        Path2D combined = path.combine(path2);
        System.out.println("Combined Path: " + combined);
    }
}
