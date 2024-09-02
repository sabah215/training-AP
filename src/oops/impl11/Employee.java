package oops.impl11;

public class Employee {
	
	public String name;
	public int salary;
	
	public Employee() {}
	public Employee (String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	protected Employee(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("John", 20000);
		Employee emp2 = new Employee("Sara", 40000);
		System.out.println(emp2.toString());
		
		
		System.out.println("--------------------------------------");
		FullTime e = new FullTime("Sabah", 50000, 40);
		e.printData();
	}

}

class FullTime extends Employee {
	
	private int hours;
	
	protected FullTime(String name, int salary, int hours) {
		super(name, salary);
		this.hours = hours;
	}
	
	public void printData() {
		System.out.println("Employee [name=" + name + ", salary=" + salary + ", hours=" + hours + "]");
	}
}


