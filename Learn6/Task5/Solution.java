class Solution {

    /**
     * @param a the given array, at least 2 distinct numbers
     * @return the second-largest number in the array,
     * i.e. the number that is less than the maximum element of the array,
     * but not less than all other elements, if any.
     */
    public static int secondLargest(int[] a) {
        //put your code here
        int largest = largest(a);
        int second = -10;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > second && a[i] < largest)
            {
                second = a[i];
            }
        }
        return second;
    }

    public static int largest(int[] a)
    {
        int answer = -2;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > answer)
            {
                answer = a[i];
            }
        }

        return answer;
    }
}