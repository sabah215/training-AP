package implementations.oops16.employeesalary;

public class Manager extends Employee{
	
	public Manager(int id, String name, String department, double salary, String designation) {
		super(id, name, department, salary,  designation);
	}
	
	@Override
	public double addBonus() {
		return getSalary() + 300;
	}

	@Override
	public String toString() {
		return "Manager [id=" + super.getId() + ", name=" + super.getName() + ", department=" + super.getDepartment() + ", salary=" + super.getSalary()
				+ ", designation=" + super.getDesignation() + "]";
	}	
}
