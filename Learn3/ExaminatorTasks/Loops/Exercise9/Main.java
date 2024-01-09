import java.util.Locale; // not done
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) 
        {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            int n = sc.nextInt();
    
            double h = (b - a) / (n - 1);
    
            int i = 0;
            while(i < n) 
            {
                double x = a + i * h;
                double Fx = 1 + 2 * Math.sin(x);
                System.out.printf("%.3f ", Fx);
                i++;
            }
        }
    }    
}
