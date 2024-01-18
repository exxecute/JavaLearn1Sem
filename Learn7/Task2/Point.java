class Point {
    //create 2 fields, 1 constructor, 3 methods (4th method is already implemented)
    private double x;
    private double y;
    
    @Override
      public boolean equals(Object obj) {
          final double DELTA = 1.0e-9;
          if (this == obj)
              return true;
          if (obj == null)
              return false;
          if (getClass() != obj.getClass())
              return false;
          Point other = (Point) obj;
          return Math.abs(x - other.x) < DELTA && Math.abs(y - other.y) < DELTA;
      }

    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    public boolean isBelonging(Line line)
    {
        return line.ordinate(x) == y;
    }

    public boolean isBelonging(Ray ray)
    {
        int x0 = ray.getX0();
        boolean isRight = ray.isRight();

        if(isRight)
        {
            if(x0 > x)
                return false;
        }
        else
        {
            if(x0 < x)
                return false;
        }

        return this.isBelonging(ray.getRayLine());
    }

    public boolean isOver(Line line) 
    {
        return line.ordinate(x) < y;
    }
}
  
class Line {
//create 2 fields, 1 constructor, 3 methods
    private double k;
    private double b;

    public Line(double k, double b) 
    {
        this.k = k;
        this.b = b;
    }

    public double ordinate(double x) 
    {
        return k * x + b;
    }

    public Point intersection(Line line) 
    {
        if(this.k == line.k)
            return null;
        double x = (line.b - this.b) / (this.k - line.k);
        double y = this.ordinate(x);
        return new Point(x, y);
    }

    public Point intersection(Ray ray) 
    {
        if(this.k == ray.getRayLine().k)
            return null;

        Line rayLine = ray.getRayLine();

        double x = (rayLine.b - this.b) / (this.k - rayLine.k);
        double y = this.ordinate(x);
        return new Point(x, y);
    }
}

class Ray {
//create 3 fields, 1 constructor, 4 methods
    private int x0;
    private Line rayLine;
    private boolean toRight;

    public Ray(int x0, Line ray, boolean toRight) 
    {
        this.x0 = x0;
        this.rayLine = ray;
        this.toRight = toRight;
    }

    public Line getRayLine() 
    {
        return rayLine;
    }

    public int getX0() 
    {
        return x0;
    }

    public boolean isRight()
    {
        return toRight;
    }

    public Point getOrigin() 
    {
        return new Point(x0, rayLine.ordinate(x0));
    }
}