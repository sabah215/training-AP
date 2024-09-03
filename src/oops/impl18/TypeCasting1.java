package oops.impl18;

public class TypeCasting1 {

	public static void main(String[] args) {
		Graduate gs = new Graduate("Mary", 101, "enrolled");
		Student s = gs; // upcasting
		s.display();
	
		/**
		 * When the Check is Useful: 
		 * 1. Preventing ClassCastException: The instanceof check is a safeguard that ensures you 
		 * 	  are only downcasting objects that are actually instances of the subclass you want to cast to. 
		 * 	  This prevents a ClassCastException at runtime.
		 * 
		 * 2. Dynamic Object References: if s is pointing to a Student object (not a Graduate), attempting to 
		 *    downcast to Graduate without checking would cause a ClassCastException. 
		 *    The instanceof check would prevent that by confirming the type before the downcast.
		 * 
		 * 3. Working with Collections or Generic Types: If you're dealing with collections or APIs where the 
		 *    exact type isn't known upfront, using instanceof helps to safely downcast objects before working 
		 *    with subclass-specific methods.
		 *    
		 * */
		System.out.println(s instanceof Graduate); // true: since referenced to Graduate type
		if(s instanceof Graduate) {
			Graduate gs2 = (Graduate) s; //downcasting: Parent assigned to child needs type casting
			gs2.display();
		}
		
		Student s2 = new Student("John", 101);
		System.out.println(s2 instanceof Graduate); // false: 
		
		if(s2 instanceof Graduate) {
			Graduate gs3 = (Graduate) s2;
			gs3.display();
		}	
		
		s2.display();
	}

}

class Student {
	
	private String name;
	private int id;
	
	public Student (String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void display() {
		
		System.out.println("Name: " + name + ", id: " + id);
	}
}

class Graduate extends Student{
	
	public String status;
	
	public Graduate(String name, int id, String status) {
		super(name, id);
		this.status = status;
	}
	
	public void display() {
		
		System.out.println("Status: " + status);
	}
	
}
