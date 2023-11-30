import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
			float a = sc.nextFloat();
			float b = sc.nextFloat();

            float c = (float) Math.sqrt(a * a + b * b);

            float perimeter = a + b + c;
            float area = 0.5f * (a * b);
            
			System.out.printf("%.3f %.3f", perimeter, area);
		}
	}

}
