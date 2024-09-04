/**
 * Object Class : equals method implementation
 * */

package oops.impl19;

public class ObjectImpl2 {

	public static void main(String[] args) {
		Student st = new Student("John", 101);
		Student st2 = new Student(" John", 101);
		
		System.out.println(st.equals(st2));
		System.out.println(st == st2);
	}
}

class Student{
	
	private String name;
	private int rollNo;
	
	public Student() {}
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		Student s = new Student();
		if(obj instanceof Student) {
			s = (Student) obj;
			return true;
		}
		
		return this.rollNo == s.rollNo;
	}
}