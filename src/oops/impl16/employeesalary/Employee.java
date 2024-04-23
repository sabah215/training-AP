/**
 * @author Sabah Ummie
 * @date 04-19-2024
 * @version 1.0
 * 
 * /**
	 * This is to create an example of dynamic binding.
	 * 
	 * In this program we first need to create a base class Employee 
	 * 	that can be used to calculate the salaries of different employees. 
	 * 
	 * The Employee class should keep a track of the employee 
	 * 	ID, name, department, salary, and designation with appropriate accessor and mutator methods.
	 * 
	 * Create an equals() method that overrides Object’s equals() method,
	 * 	where employees can check if their designation is identical. 
	 * 
	 * */

package oops.impl16.employeesalary;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private double salary;
	private String designation;
	
	public Employee(int id, String name, String department, double salary, String designation) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double addBonus() {
		return this.salary + 200;
	}


	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return (!this.designation.equals(other.designation));
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", designation=" + designation + "]";
	}
	
	
}
