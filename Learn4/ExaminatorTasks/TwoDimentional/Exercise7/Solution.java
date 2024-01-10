class Solution {

    /**
     * @param n the given positive number
     * @return the square bottom triangle n x n matrix filled with 1
     */
    public static int[][] create(int n) {
        int [][] arr = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                arr[i][j] = 1;
            }
        }

        return arr;
    }
}
