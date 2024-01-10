class Solution {

    /**
     * @param a the given array
     * @param c the given number
     * @param d the given number
     * @return the number of elements of the array a that belong to the segment [?, d]
     */
    public static int getResult(int[] a, int c, int d) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] >= c && a[i] <= d) {
                answer++;
            }
        }
        return answer;
    }
}
