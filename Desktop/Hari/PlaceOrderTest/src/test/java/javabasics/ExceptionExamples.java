package javabasics;

import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) {

		/*Scanner input = new Scanner(System.in);
		System.out.println(" Enter a number");
		int number = input.nextInt();
		int a =100;
		int div = a/number;
		System.out.println(div);*/
//ArithmeticException
		
	         	//Numberformat Exception
		/*String s = "Test";
		int in = Integer.parseInt(s);
		System.out.println(in+100);*/
		
		//Nullpointer exception
		/*String s = null;
		int t = s.length();
		System.out.println(t);
		*/
		
		//ArrayIndexoutofboundsexception
		
		/*int a[] = new int[4];
		a[11] =10;
		System.out.println(a[1]);
		  */
		//ArithmeticException
		/*System.out.println("ArithmeticException");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int  number = input.nextInt();
		int a = 100;
		try {
		int output = a/number;//ArithmeticException
		System.out.println(output);
		}
		catch(ArithmeticException e){
			System.out.println("Exception is occured... and  handled in successfully ");
			
		}
		
		System.out.println("print 1");
		*/
		
	/*	int n = 0; //initialize
		System.out.println("NumberFormatException");
		String s = "Welcome";
		try {
		 n = Integer.parseInt(s);
//		int nf = n+250;
		}
		catch(NumberFormatException e) {
			System.out.println("Exception is occured.....& handle in successfully");
		}
		System.out.println(n+250);
		*/

				
		
                
		
		
	}

}
