import java.util.Arrays;

class Solution {

    /**
     * @param a the given array
     * @param k > 0 the given number
     * @return an array containing the first k positive elements of the array a
     */
    public static int getResult(int[] a, int k) {

        int sum = 0;
        
        for(int i = 0; i < a.length; i++) 
        {
            if(a[i] % k == 0) 
            {
                sum += a[i];
            }
        }


        return sum;
    }
}
