// toString method demo
package oops.impl19;

public class ToStringDemo {

	public static void main(String[] args) {
		Person p =  new Person("John", 26);
		
		System.out.println(p.toString());
	}
}

class Person {
	
	private String name; 
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
