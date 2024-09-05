package oops.impl21;

public class ImmutableClassDemo {

	public static void main(String[] args) {
		Person p = new Person("Alice", "Clarke", 25);
		Person p2 = p;
		System.out.println(p2);
	}

}

// 1. Class must be final
final class Person{
	
	// 2. Data members must be private and final;
	private final String firstname;
	private final String lastname;
	private final int age;
	
	// 3. Data members must initialize using constructor only. 
	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	// 4. NO setter methods are defined
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
}
