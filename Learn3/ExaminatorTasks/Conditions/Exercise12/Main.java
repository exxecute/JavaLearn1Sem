import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 

            if(b > a)
            {
                a = a + b;
                b = a - b;
                a = a - b;
            }

            System.out.printf("%d %d", a, b);
        }
    }    
}
