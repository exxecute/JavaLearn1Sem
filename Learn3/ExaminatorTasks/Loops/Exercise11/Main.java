import java.util.Locale; 
import java.util.Scanner; // not done

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            double h = sc.nextDouble();
    
            double sum = 0;
    
            for(int i = 0; i < n; i++) 
            {
                double x = 2 - 10 * Math.sin(3 * i);
                if(Math.abs(x) < h) 
                {
                    sum += x;
                }
            }
    
            System.out.printf("%.3f", sum);
        }
    }
}
