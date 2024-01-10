class Solution {

    /**
     * method compresses the array
     * by shifting elements with even indices to the first half of the array
     * and replacing the rest of the array with zeros.
     *
     * @param a the given array
     */
    public static void compress(int[] a) {
        
        int answer = 0;

        for (int i = 0; i < a.length; i++) 
        {
            if (i % 2 == 0) 
            {
                a[answer] = a[i];
                answer++;
            }
            if(i >= answer) 
            {
                a[i] = 0;
            }
        }
    }
}
