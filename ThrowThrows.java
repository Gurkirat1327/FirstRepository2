package throwsthrow;

import java.util.Scanner;

public class ThrowThrows {

	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println( "This DIV calculator");
		System.out.println("Enter number 1 :");
		double num1 = a.nextDouble();
		System.out.println("Enter number 2");
		double num2  = a.nextDouble();
		
		if( num2==0)
		// {
			//System.out.println("Error");}
			throw new ArithmeticException("Cant't divide by zero");
			else{
				System.out.println(num1/num2);
			}
		
		System.out.println("End ofthe program");
		a.close();
	}
	
}
