package oops.impl5;

public class DataHiding {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
	}
}

class Base {
	
	int x = 10;
}

class Child extends Base{
	
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("Local variable " + x);
		System.out.println("Instance variable " + this.x);
		System.out.println("Base class variable " + super.x);
	}
}
