package oops.impl2;

public class Employee {
	
	static String cname;
	String ename;
	int esalary;

	public static void main(String[] args) {
		
		Employee.cname = "HCL";
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
	
		e1.ename = "Tom";
		e1.esalary = 50000;
		e2.ename = "John";
		e2.esalary = 90000;
		
		
		
		System.out.println(e1.ename + " " +e1.esalary + " " +Employee.cname);
		System.out.println(e2.ename + " " +e2.esalary + " " +Employee.cname);

	}

}
