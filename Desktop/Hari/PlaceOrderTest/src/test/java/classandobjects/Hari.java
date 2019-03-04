package classandobjects;

public class Hari {
//variables
	int hid;
	String hemp;
	
	//methods
	void Test() {
		
		System.out.println(hid);
		System.out.println(hemp);
	}
	
	/*void getValues(int id, String emp ) {
		hid = id;
		hemp = emp;
		
	}*/
	Hari(int id, String emp){
		hid = id;
		hemp = emp;
	}
	
	public static void main(String[] args) {
		
		Hari h1 = new Hari(8, "Test");//create object for a class
		h1.Test();
	
		
		
//		h.hid = 6;
//		h.hemp = "hii";
//		
//		h.Test(); //call 
//		
//		Hari h1 = new Hari();
//		h1.hid= 12;
//		h1.hemp = "yu";
//		h1.Test();
//		
//	
		
	

	}

}
