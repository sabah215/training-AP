/**
 * Shallow cloning
 * */
package oops.impl19;

public class ObjectImpl5 {

	public static void main(String[] args) {
		
		try {
			School school = new School(); // 1000
			school.schoolName = "DAV School"; // 1000
			school.directorName = "Bob";
			
			Student2 s = new Student2("John", 101, school);
			Student2 s2 = (Student2) s.clone(); 
			System.out.println(s);
			System.out.println(s2);
			
			s.school.schoolName = "DPS";
			s.school.directorName = "Tom";
			System.out.println("----------------------------------");
			System.out.println(s);  // Original object
			System.out.println(s2); // copied 
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}

class School{
	
	String schoolName;
	String directorName;

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", directorName=" + directorName + "]";
	}
}

class Student2 implements Cloneable{
	
	String name;
	int rollNo;
	School school;
	
	public Student2(String name, int rollNo, School school) {
		this.name = name;
		this.rollNo = rollNo;
		this.school = school;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", rollNo=" + rollNo + ", school=" + school + "]";
	}	
}
