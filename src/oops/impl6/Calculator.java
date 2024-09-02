package oops.impl6;

public class Calculator {

	public static void main(String[] args) {
		
		Adder adder = new Adder();
		
		System.out.println(adder.add(2, 3, 4));
		
		System.out.println(Adder.add(2, 3));
		
		//Calculator c = new Calculator();
		main("test");
		
	}
	
	public static final void main(String name) {
		System.out.println("From overloaded main method with param " + name);
	}

}
