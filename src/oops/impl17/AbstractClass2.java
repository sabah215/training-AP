package oops.impl17;

public class AbstractClass2 {

	public static void main(String[] args) {
		FullTimeEmployee fEmp = new FullTimeEmployee("John", "123456", "NY", "Engineering", "employed", 50000, 40);
		fEmp.display();
	}

}
abstract class Person{
	
	private String name;
	private String phone;
	private String address;
	
	public Person(String name, String phone, String address) {
		
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public abstract boolean isStakeHolder();
	
	
	public void display() {
		System.out.println("Name: " + this.name + ", phone : " + this.phone + ", address: " + this.address);
	}
}

class Employee extends Person{
	
	private String status;
	private int salary;
	private String department;
	
	public Employee(String name, String phone, String address, String department, String status, int salary) {
		super(name, phone, address);
		this.department = department;
		this.status = status;
		this.salary = salary;
	}
	
	
	public boolean isStakeHolder() {
		if(this.status == "employed") return true;
		
		else return false;
	}
}

class FullTimeEmployee extends Employee{
	private int hours;
	
	
	public FullTimeEmployee(String name, String phone, String address, String department, String status, int salary, int hours) {
		super(name, phone, address, department,status,salary);
		
		this.hours = hours;
	}	
}

class Student extends Person{
	
	private String department;
	private String status;
	
	public Student(String name, String phone, String address, String department, String status) {
		super(name, phone, address);
		this.department = department;
		this.status = status;
	}
	
	@Override
	public boolean isStakeHolder() {
		if(status == "enrolled") return true;
		
		else return false;
	}	
}

class GraduateStudent extends Student{
	
	private boolean isThesisTrack;
	
	public GraduateStudent(String name, String phone, String address, String department, String status, boolean isThesisTrack) {
		super(name, phone, address, department, status);
		this.isThesisTrack = isThesisTrack;
		
	}
}