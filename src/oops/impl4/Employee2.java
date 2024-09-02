package oops.impl4;

public class Employee2 {
	
	static String cname = "HCL";
	String ename;
	int esalary;
	
	static void changeCname(String cn) {
		cname = cn;
	}

	void change(String en,int sal)
	{
		ename = en;
		esalary = sal;
	}
	
	void displayResult() {
		System.out.println("Companay name - "+cname);
		System.out.println("employee details - \n name- "+ename+"\nsalary- "+esalary);
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		
		System.out.println(cname);
		
		Employee2.changeCname("TCL");
		Employee2 e1 = new Employee2();
		e1.change("Tom", 50000);
		Employee2 e2 = new Employee2();
		e2.change("John", 20000);
		
		e1.displayResult();
		e2.displayResult();
		
	}

}
