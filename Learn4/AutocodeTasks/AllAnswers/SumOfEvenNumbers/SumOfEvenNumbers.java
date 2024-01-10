package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){

        //put your code here
        if(array == null)
        {
            return 0;
        }
        
        int sum = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                sum += array[i];
            }
        }

        return sum;

        // throw new UnsupportedOperationException();
    }
}
