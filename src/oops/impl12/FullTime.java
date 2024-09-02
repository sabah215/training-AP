package oops.impl12;

import oops.impl11.Employee;

public class FullTime extends Employee {
	
private int hours;
	
	protected FullTime(String name, int salary, int hours) {
		super(name, salary);
		this.hours = hours;
	}
	
	public void printData() {
		System.out.println("Employee [name=" + name + ", salary=" + salary + ", hours=" + hours + "]");
	}

	public static void main(String[] args) {
		
		FullTime ft = new FullTime("Sarah", 50000, 40);
		ft.printData();
	}

}
