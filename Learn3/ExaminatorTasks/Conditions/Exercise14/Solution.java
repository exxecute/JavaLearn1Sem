import java.util.Locale;
import java.util.Scanner;

class Solution 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            float[] arr = new float[3];
            arr[0] = sc.nextFloat(); 
            arr[1] = sc.nextFloat(); 
            arr[2] = sc.nextFloat(); 

            boolean isSorted = false;
            while(!isSorted)
            {
                isSorted = true;
                for(int i = 0; i < arr.length - 1; i++)
                {
                    if(arr[i] > arr[i + 1])
                    {
                        float temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        isSorted = false;
                    }
                }
            }

            

            float answer = (arr[0] + arr[2]);

            System.out.printf("%.3f", answer);
        }
    }    
}
