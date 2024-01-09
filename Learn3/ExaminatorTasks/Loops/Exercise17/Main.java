
import java.util.Locale; 
import java.util.Scanner; 

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();

            int answer = 0;
    
            for(int i = 1000; i < 10000; i++) {
                int sum = 0;
                int current = i;

                while(current > 0) {
                    sum += current % 10;
                    current /= 10;
                }

                if(sum == n) {
                    answer++;
                }
            }
    
            System.out.println(answer);
        }
    }
}
