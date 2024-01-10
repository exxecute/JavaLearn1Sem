package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        try (Scanner sc = new Scanner(System.in)) 
        {
            int StrangersNum = sc.nextInt();
            if(StrangersNum == 0)
            {
                System.out.println("Oh, it looks like there is no one here");
            }
            else if (StrangersNum < 0) 
            {
                System.out.println("Seriously? Why so negative?");
            }
            else
            {
                String StrangersNames[] = new String[(int)StrangersNum + 1];

                for (int i = 0; i <= StrangersNum; i++)
                {
                    StrangersNames[i] = sc.nextLine();
                }

                for (int i = 1; i <= StrangersNum; i++)
                {
                    System.out.println("Hello, " + StrangersNames[i]);
                }
            }
        }
    }
}
