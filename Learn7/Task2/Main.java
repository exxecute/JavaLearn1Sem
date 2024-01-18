public class Main {
    public static void main(String[] args) {
        Point point0 = new Point(1, 6);
        Point point1 = new Point(3, 3);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(1, 1);
        Line line0 = new Line(1, 0);
        Line line1 = new Line(1, 5);
        Line line2 = new Line(-2, 3);
        Ray ray0 = new Ray(2, line0, true);
        Ray ray1 = new Ray(5, new Line(-1, -2), false);

        assertTrue(point0.isBelonging(line1), "point0 belongs to line1");
        assertTrue(!point1.isBelonging(line1), "point1 does not belong to line1");

        assertTrue(point1.isBelonging(ray0), "point1 belongs to ray0");
        assertTrue(!point0.isBelonging(ray0), "point0 does not belong to ray0");
        assertTrue(point2.isBelonging(ray0), "point2 does not belong to ray0");
        assertTrue(!point3.isBelonging(ray0), "point3 does not belong to ray0");

        assertTrue(point0.isOver(line0), "point0 is over line0");
        assertTrue(!point1.isOver(line0), "point1 is not over line0");
        assertTrue(!point3.isOver(line1), "point3 is not over line1");

        assertTrue(3 == line0.ordinate(3), "ordinate of line0 at x = 3 is 3");
        assertTrue(0 != line1.ordinate(0), "ordinate of line1 at x = 0 is not 0");

        assertTrue(null == line0.intersection(line1), "line0 and line1 are parallel");
        assertTrue(null == line0.intersection(line0), "line0 coincides with itself");
        assertTrue(point3.equals(line0.intersection(line2)),
            "intersection of line0 and line2 is point3");

        assertTrue(new Point(-3.5, 1.5).equals(line1.intersection(ray1)),
            "intersection of line1 and ray1 is Point(-3.5, 1.5)");
        assertTrue(null == line0.intersection(ray0), "ray0 belongs to line0");
        assertTrue(null == line1.intersection(ray0), "ray0 is parallel to line1");

        assertTrue(point2.equals(ray0.getOrigin()), "point2 is the origin of ray0");
        assertTrue(new Point(5, -7).equals(ray1.getOrigin()), "Point(5, -7) is the origin of ray1");

        //hiddenAsserts();		//hidden method to check methods of the classes Point, Line, Ray

        System.out.println("Passed!");
    }

    private static void assertTrue(boolean actual, String description) {
        if (!actual) {
            System.out.println("Really, " + description);
            System.exit(-1);
        }
    }
}
