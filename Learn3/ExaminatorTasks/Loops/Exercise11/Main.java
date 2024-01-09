import java.util.Locale; 
import java.util.Scanner; // not done

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            float n = (float) sc.nextInt();
            float h = sc.nextFloat();

            double x = 0;
            
            for(int i = 0; i < n; i++)
            {
                if(i < h)
                {
                    x = 2 - 10 * Math.sin(3 * i);
                }
            }

            System.out.printf("%.3f ", (float) x);
        }
    }
}
