import java.util.Locale; // not done
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            float a, b, n, h;

            a = sc.nextFloat();
            b = sc.nextFloat();
            n = sc.nextFloat();

            h = (b - a + 1) / n;

            float x = a;

            System.out.printf("h = %.3f\n", h);

            while(x <= b)
            {
                double f = 1 + 2 * Math.sin(x);
                System.out.printf("%.3f ", f);
                x += h;
                System.out.println(x);
            }
        }
    }    
}
