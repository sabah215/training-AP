/**
 * * If The class holds the reference of another class(mutable object),
 *   then we must implement deep copy while returning mutable object reference 
 *   from immutable * class.
 *   
 * */

package oops.impl21;

public class BreakImmutabilityExample {

	public static void main(String[] args) {
		
		Address addr = new Address("25035", "Boston", "MA");
		ImmutableStudent s = new ImmutableStudent(101, "Alice", addr);
		
		System.out.println("Before modification: " + s);
		s.getAddress().setCity("Queens");
		s.getAddress().setZipcode("23489");
		s.getAddress().setState("NY");
		
		// Immutability is violated here. The reference fields must also not be expected to change values. Hence we need to perform deep copy
		System.out.println("After modification: " + s); 
	}

}

// 1. declare class as final
final class ImmutableStudent{
	
	// 2. delare member variables as private and final
	private final int id;
	private final String name;
	private final Address address; // [SCENARIO: when a class holds reference of another class]
	
	// 3. must ne initialized using constructor
	public ImmutableStudent(int id, String name, Address address ) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	// 4. Only getters, no setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "ImmutableStudent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

class Address{
	
	private String zipcode;
	private String city;
	private String state;
	
	public Address(String zipcode, String city, String state) {
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address: " + city + ", " + state + " " + zipcode;
	}
}
