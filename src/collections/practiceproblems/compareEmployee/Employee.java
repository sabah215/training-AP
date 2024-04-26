package collections.practiceproblems.compareEmployee;

public class Employee {
	
	private int employeeId;
	private String name;
	private String departmant;
	private double salary;
	
	public Employee(int employeeId, String name, String departmant, double salary) {
	
		this.employeeId = employeeId;
		this.name = name;
		this.departmant = departmant;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmant() {
		return departmant;
	}

	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}	
	@Override
	public int hashCode() {
		return this.employeeId;
	}
	@Override
	public boolean equals(Object ob) {
		Employee e = (Employee) ob;
		return this.hashCode() == e.hashCode();
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmant=" + departmant + ", salary="
				+ salary + "]";
	}
}
