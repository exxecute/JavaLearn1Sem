package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        int max_value = -934568;

        try (Scanner sc = new Scanner(System.in)) 
        {
            int value = -1;

            while(true)
            {
                value = sc.nextInt();
                if(value == 0)
                {
                    break;
                }
                
                if(value > max_value)
                {
                    max_value = value;
                }
            }
        }

        return max_value;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
