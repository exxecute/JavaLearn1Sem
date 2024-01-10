class Solution {

    /**
     * @param a the given array
     * @return the number of negative, zero, and positive elements in the array a
     */
    public static int[] getResult(int[] a) {
        //put your code here
        int negative = 0;
        int zero = 0;
        int positive = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                negative++;
            } else if(a[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }

        //do not change the next line
        return new int[] {negative, zero, positive};
    }
}
