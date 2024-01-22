package com.epam.bsp;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    private static int maxLenght = 0;
    public static void lengthFrequency(File in, File out) throws FileNotFoundException {
        // throw new UnsupportedOperationException("Implement this method");

        Line[] lines = parseLines(in);
        HashMap<Integer, Integer> map = countLenghts(lines);

        try {
            writeToFile(map, out);
        } catch (IOException e) {
            // Handle the exception here
        }
    }

    public static void main(String[] args) {
        File in = new File("src/in.txt");
        File out = new File("src/out.txt");
        try {
            lengthFrequency(in, out);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    private static Line[] parseLines(File in) throws FileNotFoundException 
    {
        Line[] lines = new Line[100];
        int head = 0;

        try(Scanner scanner = new Scanner(in))
        {
            while(scanner.hasNextLine())
            {
                lines[head++] = LineParser.parseLine(scanner.nextLine());
            }
            scanner.close();
        }

        return lines;
    }

    private static HashMap<Integer, Integer> countLenghts(Line[] lines)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < lines.length; i++)
        {
            if(lines[i] == null)
                break;
            if(lines[i].getLenght() > maxLenght)
                maxLenght = lines[i].getLenght();
            map.put(lines[i].getLenght(), map.getOrDefault(lines[i].getLenght(), 0) + 1);
        }

        return map;
    }

    private static void writeToFile(HashMap<Integer, Integer> map, File out) throws IOException
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= maxLenght; i++)
        {
            if(map.getOrDefault(i, 0) == 0)
                continue;
            sb.append(i).append(";").append(map.getOrDefault(i, 0)).append("\n");
        }
        
        try(Writer writer = new FileWriter(out))
        {
            writer.write(sb.toString());
            writer.close();
        }
    }

}
