package javabasics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter a first number");
		   int fi =input.nextInt();
		   System.out.println("Enter a String ");
		   String str = input.next();
		   System.out.println(fi+str);
	}

}
