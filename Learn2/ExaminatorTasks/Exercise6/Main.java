//Given two floating point numbers x and y. 
//Output the value of the function f(x, y) = 2 * x + 5 * y - 10 to 3 decimal places. 

import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			// do not change the code above

			// change this code
			double avg = 2 * x + 5 * y - 10;

			// do not change the next line
			System.out.printf("%.3f", avg);
		}
	}

}
