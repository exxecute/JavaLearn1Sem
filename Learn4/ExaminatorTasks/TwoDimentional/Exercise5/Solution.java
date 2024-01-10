class Solution {

    /**
     * @param a n x n matrix
     * @return the array from elements located on the main diagonal of the matrix
     */
    public static int[] diagonal(int[][] a) {
        int b[] = new int[a.length];

        for(int i = 0; i < a.length; i++) 
        {
            b[i] = a[i][i];
        }

        return b;
    }
}
