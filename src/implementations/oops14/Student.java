/**
 * anonymous object  
 * @author Sabah
 * @version 1.0
 */

package implementations.oops14;

public class Student {
	
	private String name;
	private int id;
	private int age;
	
	public Student() {
		System.out.println("Contructor Invoked");
	}
	
	public Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	} 
	
	public void changeData(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void printData() {
		System.out.println("Student name: " + name);
		System.out.println("Student id: " + id);
		System.out.println("Student age: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sara", 101, 15);
		s1.printData();
		System.out.println();
		new Student("Harry", 102, 14).printData();
	}

}
