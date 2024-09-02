package oops.impl5;

public class MethodHidingExample {

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
		Complex c2 = new Sample();
		
		c1.f1();
		c2.f1();
		Complex.f1();
	}

}

class Complex{
	
	public static void f1() {
		System.out.println("f1 from Complex class");
	}
}

class Sample extends Complex{
	
	public static void f1() {
		System.out.println("f1 from Sample class");
	}
}
