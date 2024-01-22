package com.epam.bsp;

public class LineParser {
    public static Line parseLine(String line) {
        line = line.replaceAll(" ", "");
        String[] parts = line.split("\\)\\(");

        for(int i = 0; i < parts.length; i++)
        {
            parts[i] = parts[i].replaceAll("\\(", "");
            parts[i] = parts[i].replaceAll("\\)", "");
        }

        double[] numbers = new double[parts.length * 2];

        for(int i = 0; i < parts.length; i++)
        {
            numbers[i * 2] = Double.parseDouble(parts[i].split(";")[0]);
            numbers[i * 2 + 1] = Double.parseDouble(parts[i].split(";")[1]);
        }

        Point firstPoint = new Point(numbers[0], numbers[1]);
        Point secondPoint = new Point(numbers[2], numbers[3]);
        return new Line(firstPoint, secondPoint);
    }
}
