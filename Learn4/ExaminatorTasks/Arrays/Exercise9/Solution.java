class Solution {

    /**
     * @param a the given array, a.length >= 2
     * @return k1 + k2,
     * where k1 is maximum of elements of the array a with even indices,
     * and k2 is minimum of elements of the array a with odd indices.
     */
    public static int getResult(int[] a) {
        int k1 = a[0];
        int k2 = a[1];

        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0 && a[i] > k1) {
                k1 = a[i];
            } else if(i % 2 != 0 && a[i] < k2) {
                k2 = a[i];
            }
        }

        return k1 + k2;
    }
}
