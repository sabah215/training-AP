package oops.impl5;

// Data Shadowing
public class Employee {
	
	private String ename;
	private int salary; 
	
	public void change(String ename, int salary){
		this.ename = ename;
		this.salary = salary;
	}
	public void printEmployeeData(){
		System.out.println(ename);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.change("Tom", 45000);
		employee.printEmployeeData();
	}

}
