/**
 * Call by reference
 * @author Sabah Ummie
 * @version 1.0
 *	*/

package oops.impl15;
/**
 * A simple student class defined to assign properties of a student.
 * 
 * */
public class Student {
	
	private String name;
	private int id;
	private int age;
	
	public Student() {}
	
	public Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void setStudentData(String name, int id, int age) {
		this.name  = name;
		this.id = id;
		this.age = age;
	}
	
	public void setStudentData(Student st) {
		this.name = st.name;
		this.id = st.id;
		this.age = st.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * In this example, the values are passed to set method to set the properties of student s1.
		 * */
		Student s1 = new Student();
		s1.setStudentData("Mary", 101, 7);	// call by value
		System.out.println(s1);
		
		/**
		 * In this example, the reference of s1 is copied to s2.
		 * */
		Student s2 = new Student();
		s2.setStudentData(s1); 	// call by reference
		System.out.println(s2);
		
		s1.setStudentData("John",121,9);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
