package oops.impl3;

public class Employee {
	
	static String cname ="TCL";
	String ename;
	int esalary;
	
	static void changeCname(String c) {
		cname = c;
	}
	
	
	public static void main(String[] args) {
		Employee.changeCname("HCL");
		System.out.println("Company Name : "+Employee.cname);
		System.out.println("Access directly Company Name : "+cname);
		
		Employee employee1 = new Employee();
		employee1.changeCname("TCS");
		Employee employee2 = new Employee();
		
		System.out.println("employee1 comapany name : "+employee1.cname);
		System.out.println("employee2 comapany name : "+employee2.cname);
	}

}
