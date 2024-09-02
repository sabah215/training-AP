/**
 * Constructor Implementation : Parameterized constructor
 * @author Sabah
 * @version 1.0
 * */
package oops.impl11;

public class ConstructorImpl {
	
	public ConstructorImpl() {
		System.out.println("Constructor invoked");
	}

	public static void main(String[] args) {
		
		ConstructorImpl con = new ConstructorImpl();
		//System.out.println(con);
		
		Person p = new Person("Sabah");
		p.printData();
		
		Person s = new Student1("Fahim", 101);
		s.printData();

	}

}

class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	void printData() {
		System.out.println("Person name: " + name);
	}
}

class Student1 extends Person{
	int id;
	
	public Student1(String name, int id) {
		super(name);
		this.id = id;
	}
	
	@Override
	void printData() {
		System.out.println("Student name: " + name + ", id: " + id);
	}
}