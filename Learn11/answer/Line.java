package com.epam.bsp;

class Line {
    //create 2 fields, 2 constructors, and 9 methods

    private Point firsPoint, secondPoint;
    private int lenght = 0;

    public Line(Point firsPoint, Point secondPoint) 
    {
        this.firsPoint = firsPoint;
        this.secondPoint = secondPoint;

        this.lenght = calculateLenght();
    }

    public int getLenght()
    {
        return lenght;
    }

    private int calculateLenght()
    {
        double firstX, firxtY , secondX, secondY;

        firstX = firsPoint.getX();
        firxtY = firsPoint.getY();

        secondX = secondPoint.getX();
        secondY = secondPoint.getY();

        int answer = (int) Math.round(Math.sqrt(Math.pow(firstX - secondX, 2) + Math.pow(firxtY - secondY, 2)));

        return answer;
    }
   
  }
  