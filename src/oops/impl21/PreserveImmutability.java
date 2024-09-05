/**
 * Deep Cloning to protect Immutability
 * */
package oops.impl21;

public class PreserveImmutability {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address2 address = new Address2("Boston", "MA", "23333");
		
		ImmutableStudent2  student = new ImmutableStudent2(101, "John", address);
		System.out.println("Immutable class before modification: " + student.getAddress().getZipcode());
		student.getAddress().setZipcode("55555");
		System.out.println("Immutable class after modification: " + student.getAddress().getZipcode());	
	}
}

/**
 * Marking the class as final: This ensures that no subclass can extend and potentially alter 
 * the behavior of the ImmutableStudent2 class.
 * */

final class ImmutableStudent2{
	
	/**
	 * Private final fields: All fields (id, name, and address) are declared private and final. 
	 * This ensures that the fields can be assigned only once, either during object construction or 
	 * initialization, and cannot be changed afterward.
	 * 
	 * */
	
	private final int id;
	private final String name;
	private final Address2 address;
	
	public ImmutableStudent2(int id, String name, Address2 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	/**
	 * No setter methods: The class provides no setter methods for modifying the id, name, or address fields, 
	 * so the state of the object cannot be changed after it is created.
	 * */

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * Defensive copying (cloning): The getAddress() method returns a defensive copy of the Address2 object using the clone() method. 
	 * This prevents external code from modifying the internal Address2 object of the ImmutableStudent2 instance. 
	 * Without this, a caller could retrieve the original Address2 object and change its properties, thus breaking immutability.
	 * 
	 * */
	public Address2 getAddress() throws CloneNotSupportedException{
		return (Address2) address.clone();
	}

	@Override
	public String toString() {
		return "ImmutableStudent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}

class Address2 implements Cloneable{
	
	private String city;
	private String state;
	private String zipcode;
	
	public Address2(String city, String state, String zipcode) {
		this.city = city;
		this.state = state;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		
		return (Address2) super.clone();	
	}

	@Override
	public String toString() {
		return "Address2 [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
}
