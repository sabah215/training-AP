package oops.impl1;

public class JavaClass1 {
	
	static int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClass1 object1 = new JavaClass1();
		JavaClass1 object2 = new JavaClass1();
		JavaClass1 object3 = new JavaClass1();
		
		System.out.println("4 " + JavaClass1.x);
		
		// Not a good practice
		System.out.println("1 " + object1.x);
		
		object2.x = 15;
		System.out.println("2 " + object1.x);
		System.out.println("3 " + object2.x);
		
		System.out.println("4 " + JavaClass1.x);

	}

}
