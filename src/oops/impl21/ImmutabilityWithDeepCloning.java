package oops.impl21;

public class ImmutabilityWithDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address3 address = new Address3("Norfolk", "VA", 23333);
		ImmutableClass3 student  = new ImmutableClass3(101, "Mary", address);
		System.out.println("Before modification: " + student.getAddress().getZipcode());
		student.getAddress().setZipcode(66666);
		System.out.println("After modification: " + student.getAddress().getZipcode());
		address.setZipcode(99999);
		System.out.println("After modification from old address object reference: " + address.getZipcode());
	}
}

// Immutable class
final class ImmutableClass3{
	
	private final int id;
	private final String name;
	private final Address3 address;
	
	/**
	 * Constructor Cloning: When the ImmutableClass3 constructor is called, the Address3 object passed 
	 * as a parameter is cloned, ensuring that the internal address field points to a new copy of the Address3 object.
	 * */
	
	public ImmutableClass3(int id, String name, Address3 address) throws CloneNotSupportedException {
		this.id = id;
		this.name = name;
		
		/**
		 * Deep Cloning in Constructor: When an ImmutableClass3 object is constructed, 
		 * the Address3 object passed as an argument is cloned:
		 * 
		 * This ensures that the original Address3 object is not stored directly in ImmutableClass3. 
		 * Instead, a cloned copy is stored, and any changes to the original Address3 object will not 
		 * affect the address field of the ImmutableClass3 instance.
		 * 
		 * */
		this.address = (Address3) address.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	/**
	 * Cloning in Getter Method: Similarly, when the getAddress() method is called, a clone of the address object is returned:
	 * 
	 * Getter Cloning: Every time getAddress() is called, it returns a clone of the address, ensuring that 
	 * modifications to the returned Address3 object do not affect the internal state of ImmutableClass3.
	 * 
	 * 
	 * This prevents the caller from getting a direct reference to the internal address object. 
	 * Any changes made to the cloned object returned by the getter will not affect the internal 
	 * state of the immutable object.
	 * 
	 * 
	 * */
	public Address3 getAddress() throws CloneNotSupportedException {
		return (Address3) address.clone();
	}

	@Override
	public String toString() {
		return "ImmutableClass3 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}	
	
	/**
	 * How Immutability is Preserved:
		- Original Address Object: Any modification to the original Address3 object (outside of ImmutableClass3)
		  has no impact on the ImmutableClass3 instance, because the instance stores a clone of the Address3 object, 
		  not the original.
		
		- Returned Address Object: The getAddress() method returns a clone of the internal Address3 object, so even 
		  if the caller modifies the returned object (as seen in student.getAddress().setZipcode(66666);), 
		  it does not affect the internal state of the immutable object.
		  
		  Why Deep Cloning is Important:
			Deep cloning ensures that the mutable Address3 object is completely isolated from the internal state of ImmutableClass3. 
			Without deep cloning, changes to the original or returned Address3 object could directly affect the 
			ImmutableClass3 object, violating its immutability.
		  
	 * */
}

class Address3 implements Cloneable{
	
	private String city;
	private String state;
	private int zipcode;
	
	public Address3(String city, String state, int zipcode) {
		
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

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address3 [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}	
}
