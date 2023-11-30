//put imports here

//Given an integer number. 
//Output the last digit of a number.

import java.util.Scanner;

class Main 
{

	public static void main(String[] args) 
    {
		try (Scanner sc = new Scanner(System.in)) 
        {
			int a = sc.nextInt();
			// do not change the code above

			// change this code
			int avg = (a < 0) ? -a % 10 : a % 10;


			// do not change the next line
			System.out.printf("%d", avg);
		}
	}
}
