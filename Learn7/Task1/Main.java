public class Main 
{
    public static void main(String[] args) 
    {
        Line line0 = new Line();
        line0.setB(-5);
        Line line1 = new Line(0, 2);
        Line line2 = new Line();
        line2.setK(1);

        System.out.println("true: " + line0.isParallel(line1));
        System.out.println("false: " + line0.isParallel(line2));

        Line line3 = new Line(2, 0);
        Line line4 = new Line(-0.5, 4);
        Line line5 = new Line(-0.5, 1);

        System.out.println("true: " + line3.isPerpendicular(line4));
        System.out.println("false: " + line0.isPerpendicular(line4));


        System.out.println("true: " + line4.isOver(line5));
        System.out.println("false: " + line1.isOver(line5));

        System.out.println("true: " + (line4.angleOfSlope() == Math.atan(-0.5)));

        System.out.println("true: " + (line4.abscissa0() == 8.0));
    }
}
