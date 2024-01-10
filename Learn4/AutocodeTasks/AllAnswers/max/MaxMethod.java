package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        // throw new UnsupportedOperationException();

        int max = -10000000;

        for (int i = 0; i < values.length; i++) 
        {
            if(values[i] > max)
            {
                max = values[i];
            }
        }

        return max;
    }
}
