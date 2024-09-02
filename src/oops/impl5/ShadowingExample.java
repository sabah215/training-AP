package oops.impl5;

public class ShadowingExample {
	String name = "John";
	int age = 25;
	
	public void display() {
		String name = "Mary";
		int age = 30;
		System.out.println("Name: " + this.name + " \nAge: " + this.age);
		System.out.println("--------------------------------------------");
		System.out.println("Name: " + name + " \nAge: " + age);
	}
	
	public static void main(String[] args) {
		
		ShadowingExample sh = new ShadowingExample();
		
		sh.display();
		
	}

}
