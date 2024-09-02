/*
 * Constructor Implementation : Parameterize constructor
 * Initializing class level properties
 * @author Sabah
 * @version 1.0*/

package oops.impl11;

public class Student {
	
	private String name;
	private String id;
	private int age;
	
	public Student(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sabah", "101", 37);
		System.out.println(s1.toString());
	}

}
