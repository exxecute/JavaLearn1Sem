package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        try (Scanner sc = new Scanner(System.in)) 
        {
            int people = sc.nextInt();
            int pieces = sc.nextInt();

            int pizzas = 1;
            while((pizzas * pieces) % people != 0)
            {
                pizzas++;
            }
            System.out.println(pizzas);
        }
    }
}
