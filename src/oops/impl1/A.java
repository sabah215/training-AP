package oops.impl1;


public class A {
	
	static void printInfo() {
		System.out.println("Static method in class A");
	}
	
	public static void main(String [] args) {
		A refA = new B();
		refA.printInfo();
		
		B refB = new B();
		//refB.printInfo();
	}

}

class B extends A {
	static void printInfo() {
		System.out.println("Static method in class B");
}
	}
