class Solution {

    /**
     * @param a m x n matrix
     * @return the transpose matrix
     */
    public static int[][] transpose(int[][] a) {
        //put your code here
        int[][] b = new int[a[0].length][a.length];

        for(int i = 0; i < b.length; i++) 
        {
            for(int j = 0; j < b[i].length; j++) 
            {
                b[i][j] = a[j][i];
            }
        }

        return b;
    }
}
