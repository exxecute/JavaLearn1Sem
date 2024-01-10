package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = -1;
        int sum = 0;
        int amount = 0;

        while(true)
        {
            value = scanner.nextInt();
            if(value == 0)
            {
                break;
            }
            
            sum += value;
            amount++;
        }

        System.out.println(sum / amount);
    }

}