class Line {
    //create 2 fields, 2 constructors, and 9 methods

    private double k;
    private double b;

    public Line(double k, double b) 
    {
        this.k = k;
        this.b = b;
    }

    public Line() 
    {
        this(0, 0);
    }

    public boolean isParallel(Line line) 
    {
        return this.k == line.k;
    }

    public void setB(double b) 
    {
        this.b = b;
    }

    public double getB() 
    {
        return b;
    }

    public void setK(double k) 
    {
        this.k = k;
    }

    public double getK() 
    {
        return k;
    }

    public boolean isPerpendicular(Line line) 
    {
        return (this.k > 0 && line.k < 0) || (this.k < 0 && line.k > 0);
    }
    
    public boolean isOver(Line line)
    {
        return (this.k > 0 && line.k > 0) || (this.k < 0 && line.k < 0);
    }

    public double angleOfSlope()
    {
        return Math.atan(this.k);
    }

    public double abscissa0()
    {
        return -this.b / this.k;
    }
  }
  