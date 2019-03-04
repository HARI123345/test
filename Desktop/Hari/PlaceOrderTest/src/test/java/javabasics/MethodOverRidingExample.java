package javabasics;


class Bank{
	double rateOfInterRest() {
		return 0;
	}
}

class SBI extends Bank {
	double rateOfInterRest() {
		return 12.5;
		
	}
}

class ANDHRA extends Bank{
	
	 double rateOfInterRest() {
		 
		 return 14.5;
	 }
}

public class MethodOverRidingExample {

	public static void main(String[] args) {
		
		SBI sobj = new SBI();
		
		double d1 = sobj.rateOfInterRest();
		
		System.out.println(d1);
		
		Bank s1obj = new  Bank();
		
	   System.out.println(s1obj.rateOfInterRest());
	   
	   ANDHRA aobj = new ANDHRA();
	   
	    System.out.println(aobj.rateOfInterRest());
		
	}

}
