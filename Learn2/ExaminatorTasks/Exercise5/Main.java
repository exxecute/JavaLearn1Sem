import java.util.Locale;
import java.util.Scanner;

//Given two floating point numbers a and b != 0. 
//Calculate their sum, difference, product, and quotient 
//and output them to 3 decimal places, 
//separating numbers from each other by 1 space. 

class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("EN"));
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble(); 
			double b = sc.nextDouble();
			//do not change the code above
			
			//change this code
			double sum = a + b;
			double diff = a - b;
			double prod = a * b;
			double quot = a / b;
			
			//do not change this line
      System.out.printf("%.3f %.3f %.3f %.3f", sum, diff, prod, quot);
    }

	}

}
