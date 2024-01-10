class Solution {

    /**
     * @param a the given array, a.length <= 30
     * @return the sum of elements of the array a whose indices are prime numbers
     */
    public static int getResult(int[] a) {
        int primeNumbers[] = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        int sum = 0;
        
        for(int i = 0; i < primeNumbers.length; i++) 
        {
            if(a.length > primeNumbers[i]) 
            {
                sum += a[primeNumbers[i]];
            }
            else
            {
                break;
            }   
        }
        return sum;
    }
}