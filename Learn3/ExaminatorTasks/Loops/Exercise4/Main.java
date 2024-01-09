import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int m = sc.nextInt(); 
            int n = sc.nextInt(); 

            n = n % 2 == 0 ? n : n - 1;

            while(m <= n)
            {
                System.out.printf("%d ", n);
                n -= 2;
            }
        }
    }    
}
