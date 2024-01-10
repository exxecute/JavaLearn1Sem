package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            long password = sc.nextLong();

            if(password == PASSWORD)
            {
                System.out.println("Hello, Agent");
            }
            else
            {
                System.out.println("Access denied");
            }
        }
    }
}
