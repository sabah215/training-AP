package oops.impl16.employeesalary;

public class Clerk extends Employee{

	public Clerk(int id, String name, String department, double salary, String designation) {
		super(id, name, department, salary, designation);
	}
	
	@Override
	public double addBonus() {
		return getSalary() + 100;
	}

	@Override
	public String toString() {
		return "Clerk [id=" + super.getId() + ", name=" + super.getName() + ", department=" + super.getDepartment() + ", salary=" + super.getSalary()
		+ ", designation=" + super.getDesignation() + "]";
	}
}
