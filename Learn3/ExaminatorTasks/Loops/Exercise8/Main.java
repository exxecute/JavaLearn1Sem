import java.util.Locale;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            double a, b, h, f, x;

            a = sc.nextDouble();
            b = sc.nextDouble();
            h = sc.nextDouble();

            x = a;

            for(int i = 0; i < (b - a) / h; i++)
            {
                f = x >= 2 ? x : 2 * x + 1;
                System.out.printf("%.3f ", f);
                x += h; 
            }
        }
    }    
}
