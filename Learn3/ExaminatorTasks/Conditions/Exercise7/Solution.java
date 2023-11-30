import java.util.Locale;
import java.util.Scanner;

class Solution 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            float x1 = sc.nextFloat(); 
            float y1 = sc.nextFloat();
            float x2 = sc.nextFloat();
            float y2 = sc.nextFloat();

            int answer = 0;

            if((x1 * y1) > (x2 * y2))
            {
                answer = 1;
            }
            else if((x1 * y1) < (x2 * y2))
            {
                answer = -1;
            }

            System.out.println(answer);
        }
    }    
}
