package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        try (Scanner sc = new Scanner(System.in)) 
        {
            int cost = sc.nextInt();
            int numberOfFriends = sc.nextInt();

            if (cost < 0) 
            {
                System.out.println("Bill total amount cannot be negative");
            }
            else if(numberOfFriends <= 0)
            {
                System.out.println("Number of friends cannot be negative or zero");
            }
            else
            {

                int costPerPerson = 0;

                if(cost == 0)
                {
                    costPerPerson = 0;
                }
                else if(numberOfFriends == 0)
                {
                    costPerPerson = 0;
                }
                else if(cost < numberOfFriends)
                {
                    costPerPerson = 1;
                }
                else
                {
                    costPerPerson = cost / numberOfFriends;

                    costPerPerson = (costPerPerson * 110) / 100;
                }

                System.out.println(costPerPerson);
            }
        }
    }
}
