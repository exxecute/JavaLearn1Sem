import java.util.Locale; 
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            float sum = 0;
            for(int i = 1; i <= n; i++)
            {
                float x = (float) (1d / i);
                sum += x;
            }
            System.out.printf("%.3f ",sum);
        }
	}
}
