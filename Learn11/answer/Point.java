package com.epam.bsp;

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

    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }
}
