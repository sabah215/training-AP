package oops.impl13;

public class StaticBlockImpl {
	
	private static int x;
	private int a;
	
	static {
		x = 10;
		System.out.println("x is a static variable and the value is " + x + " and created once while the class is loaded.");
	}
	

	
	public StaticBlockImpl(int a) {
		this.a = a;
		System.out.println("Value of a is " + this.a + " and created with every instance.");
	}

	public static void main(String[] args) {
		
		StaticBlockImpl s = new StaticBlockImpl(5);
		System.out.println("-------------------------------");
		StaticBlockImpl s2 = new StaticBlockImpl(8);
		
		System.out.println(StaticBlockImpl.x);
	}

}
