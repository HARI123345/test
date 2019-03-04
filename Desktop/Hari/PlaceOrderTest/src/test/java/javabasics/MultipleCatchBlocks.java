package javabasics;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		//int a = 10;

		try {
		//System.out.println(a/0); //Arithmetic Exception
			String s = "Welcome";
			int num = Integer.parseInt(s);//NumberFormat Exception
	}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is occured & handled in successfully");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException is occured & handle in successfully ");
		}
				
	   catch(NullPointerException e) {
         System.out.println("NullPointerException is occured & handle in successfully");
	   }
	   }
}
	


