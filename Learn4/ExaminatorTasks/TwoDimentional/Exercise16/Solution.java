class Solution {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int b[][] = new int[n][n];
        int value = 1;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                b[i][j] = value;
                value++;
            }
        }

        return b;
    }
}
