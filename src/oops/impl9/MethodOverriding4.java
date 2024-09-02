/**
 * Implementation of method overriding by changing return type (covariant type) 
 * @author Sabah
 * @version 1.0
 */
package oops.impl9;

class Student {
	
	public Student getStudent() {
		System.out.println("Student Class : getStudent()");
		return new Student();
	}
	
	public Student getId() {
		System.out.println("Student Class : getId()");
		return new Student();
	}
}

class GraduateStudent extends Student{
	
	@Override
	public GraduateStudent getStudent() {
		System.out.println("GraduateStudent Class : getStudent()");
		return new GraduateStudent();
	}
	
	@Override
	public GraduateStudent getId() {
		System.out.println("Student Class : getId()");
		return new GraduateStudent();
	}
}

public class MethodOverriding4 {

	public static void main(String[] args) {
		
		Student s = new GraduateStudent();
		s.getStudent();
		

	}

}
