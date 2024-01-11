class Solution {

    /**
     * method sorts two non-empty arrays of equal length parallelly by ascending order
     * (first sort by letters, and if elements of the array letters are equal,
     * then sort by numbers).
     *
     * @param letters the given array
     * @param numbers the given array
     */
    public static void sort(char[] letters, int[] numbers) {
        //put your code here

        boolean flag = true;

        while(flag)
        {
            flag = false;
            for(int j = 0; j < letters.length - 1; j++)
            {
                if(letters[j] > letters[j + 1])
                {
                    flag = true;
                    char temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;

                    int numTemp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = numTemp;
                }
            }
        }

        int start = 0;
        int end = 0;
        boolean flag1 = false;
        for(int i = 0; i < letters.length - 1; i++)
        {
            if((letters[i] == letters[i + 1]) && !flag1)
            {
                start = i;
                flag1 = true;
            }
            else if((letters[i] != letters[i + 1]) || (i == letters.length - 2))
            {
                end = i;
                if((i == letters.length - 2))
                {
                    end++;
                }
                if((start != end) && flag1)
                {
                    flag1 = false;
                    flag = true;
                    while(flag)
                    {
                        flag = false;
                        for(int j = start; j < end; j++)
                        {
                            if(numbers[j] > numbers[j + 1])
                            {
                                flag = true;
                                int temp = numbers[j];
                                numbers[j] = numbers[j + 1];
                                numbers[j + 1] = temp;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        sort(new char[]{'a', 'a', 'a'}, new int[]{1, 2, 3});    
    }
}

