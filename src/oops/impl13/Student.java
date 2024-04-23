/**
 * Constructor chaining within class implementation  
 * Initializing class level properties
 * @author Sabah
 * @version 1.0
 */
package oops.impl13;

public class Student {
	
	private String name;
	private String id;
	private int age;
	
	public Student (String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public Student (String name, String id) {
		// Constructor call must be first statement
		this(16);
		this.name = name;
		this.id = id;
	}
	
	public Student (int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("John", "101", 20);
		System.out.println(s1.toString());
		System.out.println();
		Student s2 = new Student("Sara", "102");
		System.out.println(s2.toString());

	}

}
