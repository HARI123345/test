package javabasics;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		       int num = input.nextInt();
		       try {
		       System.out.println(num/0);
	}
		       catch(ArithmeticException e) {
		    	   System.out.println("ArithmeticException is occured ");
		    	   
		       }
		       finally{
		    	   System.out.println("This is a finally block");
		    	   
		       }
		    	   
		       }
		
	

}
