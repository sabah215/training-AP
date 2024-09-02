/**
 * Anonymous object example using nested class.
 * @author Sabah Ummie
 * @version 1.0
 * @date Apr 15, 2024
 * */
package oops.impl14;

public class OuterClass {
	
	class InnerClass {
		void display() {
			System.out.println("Dispalying from Inner Class.");
		}
	}

	public static void main(String[] args) {
		new OuterClass().new InnerClass().display();

	}

}
