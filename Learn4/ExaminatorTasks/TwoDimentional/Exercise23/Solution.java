class Solution {

    /**
     * sorts the matrix by ascending of the initial element of each row
     * @param a m x n matrix, initial elements of each row are distinct
     */
    public static void sortedByInitial(int[][] a) {
        //put your code here
        boolean flag = true;

        while(flag)
        {
            flag=false;
            
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i][0]>a[i+1][0])
                {
                    int[] temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    flag=true;
                }
            }
        }
    }
}
