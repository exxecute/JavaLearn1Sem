class Solution {

    /**
     * @param n the given positive number
     * @return the bottom triangle 2 dimensional array with n rows filled with 1
     */
    public static int[][] create(int n) {
        int [][] arr = new int[n][];

        for(int i = 0; i < n; i++) 
        {
            arr[i] = new int[i + 1];
            for(int j = 0; j < i + 1; j++) 
            {
                arr[i][j] = 1;
            }
        }

        return arr;
    }
}
