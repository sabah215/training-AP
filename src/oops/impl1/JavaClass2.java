package oops.impl1;



public class JavaClass2 {
	
	int x;
	
	public static void main(String[] args) {
		
		JavaClass2 object1 = new JavaClass2();
		JavaClass2 object2 = new JavaClass2();
		JavaClass2 object3 = new JavaClass2();
	
		object1.x = 4;
		object2.x = 5;
		object3.x = 6;
		
		System.out.println("Object1 x = "+object1.x);
		System.out.println("Object2 x = "+object2.x);
		System.out.println("Object3 x = "+object3.x);

	}

}
