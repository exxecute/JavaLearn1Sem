import java.util.Locale; 
import java.util.Scanner; 

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int i = n; i <= m; i++)
            {
                System.out.printf("%c ", i);
            }
        }
    }
}
