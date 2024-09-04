package oops.impl19;

public class CloneableDemo {

	public static void main(String[] args) {
		
		try {
			Address ad = new Address("56 North st", "33333", "Norfolk", "VA");
			Employee e1 = new Employee("John", 101, 50000, ad);
			Employee e2 = (Employee) e1.clone();
			System.out.println(e2.id);
			System.out.println(e2.name);
			System.out.println(e2.address);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Employee implements Cloneable{
	
	String name;
	int id;
	int salary;
	Address address;
	
	public Employee(String name, int id, int salary, Address address) throws CloneNotSupportedException {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = (Address) address.clone();
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}



	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class Address implements Cloneable{
	String street;
	String zipcode;
	String city;
	String state;
	
	public Address(String street, String zipcode, String city, String state) {
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address: " + street + ", " + city + ", " + state + ", " + zipcode;
	}
	
	
}
