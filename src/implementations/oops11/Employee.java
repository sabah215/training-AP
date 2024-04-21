package implementations.oops11;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee() {}
	public Employee (String name, int salary) {
		this.name = name;
		this.salary = salary;
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
	}

}
