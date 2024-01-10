class Solution {

    /**
     * @param a m x n matrix, where n > 1
     * @return the m x 2 matrix containing the left and right columns of matrix a
     */
    public static int[][] create(int[][] a) {
        int b[][] = new int[a.length][2];

        for(int i = 0; i < a.length; i++) 
        {
            b[i][0] = a[i][0];
            b[i][1] = a[i][a[i].length - 1];
        }

        return b;
    }
}
