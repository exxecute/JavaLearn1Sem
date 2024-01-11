class Solution {

    /**
     * method partially sorts an array by ascending order
     * with the bubble sort algorithm
     *
     * NOTE: Partially means that the bubble sort algorithm ends
     * after the earlier of two possible events:
     * 1) the array is sorted, 2) k swaps are done.
     *
     * @param a the given array
     * @param k the given number of swaps, k > 0
     */
    public static void sort(int[] a, int k) {
        //put your code here
        boolean flag = true;

        while(flag)
        {
            flag = false;
            for(int j = 0; j < a.length - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    k--;
                    
                    if(k == 0)
                    {
                        flag = false;
                        break;
                    }
                }
            }
        }
    }
}
