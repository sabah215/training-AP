/**
 * Object Class : clone method- cloning
 * */
package oops.impl19;

public class ObjectImpl4 {

	public static void main(String[] args) {
		try { // 6
			Student1 s = new Student1("Mary", 101);
			Student1 s1 = (Student1) s.clone(); // 5
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s == s1);
			
			System.out.println("-------------------------------------------");
			s.name = "Alice";
			s.rollno = 333;
			
			System.out.println(s);
			System.out.println(s1);
		}catch(CloneNotSupportedException e) { // 7
			e.printStackTrace();
		}
		
		
	}

}

class Student1 implements Cloneable{ // 1.
	
	String name;
	int rollno;
	
	public Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	
	
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollno=" + rollno + "]";
	}



	@Override // 2
	public Object clone() throws CloneNotSupportedException { // 3
		return super.clone(); // 4
	}
}
