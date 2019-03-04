package javabasics;

public class ConstructorConcept {

	//Constructor's created inside class
	//Constructor's name as same class
	//Constructor don't have return type
       
	int x ;
	int y ;
	
	public ConstructorConcept() {
		
		x=2;
		y=5;
	 
	}
	
   public  static void  main(String[] args) {
	ConstructorConcept c = new ConstructorConcept();
	System.out.println(c.x);
	System.out.println(c.y);
	
	
}
}
