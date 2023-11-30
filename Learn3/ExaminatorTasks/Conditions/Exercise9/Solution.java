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

            x1 = (x1 < 0) ? -x1 : x1;
            y1 = (y1 < 0) ? -y1 : y1;
            x2 = (x2 < 0) ? -x2 : x2;
            y2 = (y2 < 0) ? -y2 : y2;

            float Len = (x1 - x2) + (y1 - y2);
            int answer = 0;
            if(Len > 0)
            {
                answer = -1;
            }
            else if(Len < 0)
            {
                answer = 1;
            }

            System.out.printf("%d", answer);
        }
    }    
}
