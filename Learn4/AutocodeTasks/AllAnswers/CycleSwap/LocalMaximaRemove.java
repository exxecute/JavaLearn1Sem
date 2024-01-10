package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here
        int[] result = new int[array.length];
        int count = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(i == 0)
            {
                if(!(array[i] > array[i + 1]))
                {
                    result[count] = array[i];
                    count++;
                }
            }
            else if(i == array.length - 1)
            {
                if(!(array[i] > array[i - 1]))
                {
                    result[count] = array[i];
                    count++;
                }
            }
            else if(array[i] > array[i - 1] && array[i] > array[i + 1])
            {
                continue;
            }
            else
            {
                result[count] = array[i];
                count++;
            }
        }

        int[] answer = new int[count];

        for(int i = 0; i < count; i++)
        {
            answer[i] = result[i];
        }

        return answer;
        // throw new UnsupportedOperationException();
    }
}
