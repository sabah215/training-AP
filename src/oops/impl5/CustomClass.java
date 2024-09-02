package oops.impl5;

public class CustomClass {
	// accessed by object
	int x = 10;
	
	public void display() {
		// accessed locally when method is invoked
		int x = 20; // shadowing
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		CustomClass customClass = new CustomClass();
		customClass.display();
	}

}
