import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int value = sc.nextInt();

            int product = getNumer(0, value) * getNumer(1, value) * getNumer(2, value) * getNumer(3, value);

            System.out.printf("%d", product);
        }
    }

    public static int getNumer(int index, int number)
    {
        return  (int) ((number % (int) Math.pow(10, 1 + index)) / (int) Math.pow(10, index));
    }
}
