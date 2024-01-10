class Solution {

    /**
     * @param a a 2-dimensional array
     * @return the array from sums of negative elements in each row
     */
    public static int[] sumsOfNegatives(int[][] a) {
        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++) 
        {
            int sum = 0;
            for(int j = 0; j < a[i].length; j++) 
            {
                if(a[i][j] < 0) 
                {
                    sum += a[i][j];
                }
            }
            b[i] = sum;
        }

        return b;
    }
}
