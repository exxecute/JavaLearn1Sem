class Solution {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i <= j - 1) 
                {
                    arr[i][j] = 0;
                } 
                else
                {
                    arr[i][j] = j + n - i;
                }
            }
        }

        return arr;
    }
}
