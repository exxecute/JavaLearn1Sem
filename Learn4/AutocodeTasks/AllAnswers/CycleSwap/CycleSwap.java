package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) 
    {
        if(array.length == 0)
        {
            return;
        }
        int temp = array[array.length - 1];
        for(int i = array.length - 1; i > 0; i--)
        {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    static void cycleSwap(int[] array, int shift) 
    {
        for(int i = 0; i < shift; i++) 
        {
            cycleSwap(array);
        }
    }

    public static void main(String[] args)
    {
        int[] array = new int[]{};
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
    }
}
