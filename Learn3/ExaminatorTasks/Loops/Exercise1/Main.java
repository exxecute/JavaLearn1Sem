import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int d = sc.nextInt(); 
            int toD = 0;

            while(d + 1 != toD)
            {
                System.out.printf("%d ",toD);
                toD++;
            }
        }
    }    
}
