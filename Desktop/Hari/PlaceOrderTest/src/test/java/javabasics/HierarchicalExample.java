package javabasics;

class Parent {
	int a;
	void display() {
		System.out.println(a);
	}
}
class Child1 extends Parent{
	int b;
	void show() {
		System.out.println(b);
	}
	
}

class Child2 extends Parent {
	int c;
	void print() {
		System.out.println(c);
	}
}

public class HierarchicalExample {

	public static void main(String[] args) {
       
		Child1 cobj = new Child1();
		cobj.a=12;
		cobj.b=15;
		cobj.display();
		cobj.show();
		
		Child2 cobj1 = new Child2();
		cobj1.a = 18;
		cobj1.c = 23;
		cobj1.display();
		cobj1.print();
	}
	
}
