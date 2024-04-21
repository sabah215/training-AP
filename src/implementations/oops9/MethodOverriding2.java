/*
 * Implementation of calling of super class method using super keyword.(method overriding) 
 * @author Sabah Ummie
 * @version 1.0
 * @date 04-11-2024 
 * */
package implementations.oops9;

class Animal {
	public void sleep() {
		System.out.println("Animal is sleeping...");
	}
}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("Dog is barking...");
	}
	
	public void sleep() {
		super.sleep();
		System.out.println("Dog is sleeping");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Example 1: Parent class sleep() method called. */
		 Animal animal = new Animal();
		 animal.sleep();
		
		System.out.println();
		
		/* Example 2: Child class sleep() method called. Child class uses super keyword to call method from parent class. */
		 Dog dog = new Dog();
		 dog.sleep();
		
		System.out.println();
		
		/* Example 3: Child class bark() method called. */
		 Dog dog2 = new Dog();
		 dog2.bark();
		
		System.out.println();
		
		/* Example 4: Parent class class reference used to call child class method bark() method called. 
		   Dynamic binding */
		 Animal animal2 = new Dog();
		 animal2.sleep();
	}

}
