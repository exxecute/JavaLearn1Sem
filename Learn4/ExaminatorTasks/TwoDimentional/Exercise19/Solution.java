class Solution {

    /**
     * @param a a 2-dimensional array, where each row contains at least 1 element
     * @return the minimum value among the maximum values on each row of the array
     */
    public static int minAmongMaxs(int[][] a) {
        //put your code here
        int[] max = new int[a.length];

        for(int i = 0; i < a.length; i++) 
        {
            max[i] = a[i][0];
            for(int j = 0; j < a[i].length; j++) 
            {
                if(a[i][j] > max[i]) 
                {
                    max[i] = a[i][j];
                }
            }
        }

        int min = max[0];
        
        for(int i = 0; i < max.length; i++) 
        {
            if(max[i] < min) 
            {
                min = max[i];
            }
        }

        return min;
    }
}
