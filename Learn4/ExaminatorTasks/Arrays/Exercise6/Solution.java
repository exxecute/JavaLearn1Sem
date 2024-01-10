class Solution {

    /**
     * @param a the given array
     * @return an array, its i-th element = 1 if a[i] > i, otherwise = 0
     */
    public static int[] getResult(int[] a) {
        int b[] = new int[a.length];

        for(int i = 0; i < a.length; i++) 
        {
            if(a[i] > i) 
            {
                b[i] = 1;
            }
            else
            {
                b[i] = 0;
            }
        }

        return b;
    }
}
