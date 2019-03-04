package javabasics;
// Test is parent class
class Test {
	int a;
	
	void display() {
		System.out.println(a);
	}
}
//Demo is child class of Test
	class Demo extends Test {
		int b;
		
		void get() {
			System.out.println(b);
		}
	}
	//Post is child class  of Demo
	
	class Post extends Demo{
		int c ;
		
		void show() {
			System.out.println(c);
		}
	}


public  class InheritanceTypes {

	public static void main(String[] args) {

		 Test tobj = new Test();
		 tobj.a = 20;
		 tobj.display();
		 
		 Demo dobj = new Demo();
		 dobj.a=21;
		 dobj.b=30;
		 dobj.display();
		 dobj.get();
		 Post pobj = new Post();
		 pobj.a = 11;
		 pobj.b = 12;
		 pobj.c = 13;
		 pobj.display();
		 pobj.get();
		 pobj.show();
 
}
}

