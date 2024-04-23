/**
 * final key word  : blank final static and 
 * instance data memebers
 * final class can’t inherit, 
 * final method can’t override,
 * final variable cannot be change
 * @author Sabah
 * @version 1.0
 */
package oops.impl14;

public class Person { 
	
	final String NAME;
	final static String CNAME;
	
	static {
		CNAME = "HCL";
	}
	
	public Person(String name) {
		this.NAME = name;
	}
	
	public void displayData() {
		System.out.println("Person Name: " + NAME);
		System.out.println("Company Name: " + CNAME);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("John");
		p.displayData();

	}

}
