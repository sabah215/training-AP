/**
 * Anonymous object example using nested class.
 * @author Sabah Ummie
 * @version 1.0
 * @date Apr 15, 2024
 * */
package implementations.oops14;

public class OuterClass {
	
	class InnerClass {
		void display() {
			System.out.println("Dispalying from Inner Class.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClass().new InnerClass().display();

	}

}
