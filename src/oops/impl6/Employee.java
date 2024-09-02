package oops.impl6;

public class Employee {
	
	private String ename;
	private int salary;
	
	private void changeData(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
	
	private void changeData(String ename) {
		this.ename = ename;
	}
	
	private void changeData(int salary) {
		this.salary = salary;
	}
	
	private void displayData() {
		System.out.println(ename);
		System.out.println(salary);
	}
	
	private void displayMessage() {
		System.out.println("Message diplayed without name.");
	}
	
	private static void displayMessage(String name) {
		System.out.println("Message diplayed with name." + name);
	}
	
	public static void main(String [] args) {
		
		Employee e = new Employee();
		e.changeData(50000);
		e.displayData();
		System.out.println("------------------------------");
		e.changeData("John");
		e.displayData();
		System.out.println("------------------------------");
		e.changeData("Mary", 20000);
		e.displayData();
		System.out.println("------------------------------");
		e.displayMessage();
		Employee.displayMessage("Alice");
	}

}
