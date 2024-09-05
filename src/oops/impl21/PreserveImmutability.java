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

final class ImmutableStudent2{
	
	private final int id;
	private final String name;
	private final Address2 address;
	
	public ImmutableStudent2(int id, String name, Address2 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

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
