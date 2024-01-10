package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        try (Scanner sc = new Scanner(System.in)) 
        {
            int day = sc.nextInt();
            int night = sc.nextInt();
            int height = sc.nextInt();
            int days = 0;
            if (day <= night && !(day >= height))
            {
                System.out.println("Impossible");
                return;
            }
            else
            {
                while (height > 0)
                {
                    days++;
                    height -= day;
                    if (height > 0)
                    {
                        height += night;
                    }
                }
                System.out.println(days);
            }
        }
    }
}
