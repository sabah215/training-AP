package oops.impl6;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		A a  = new A();
		a.method();
		a.method("John");
		System.out.println("-----------------------");
		
		B b = new B();
		b.method("Mary");

	}

}

class A {
	 
	public void method() {
		System.out.println("From class A");
	}
	
	public void method(String name) {
		System.out.println("From class A overloaded method with param " + name);
	}
}

class B  extends A{
	
	@Override
	public void method(String name) {
		int age = 14;
		System.out.println("From class B overriden method with param " + name + " and variable " + age);
	}
}
