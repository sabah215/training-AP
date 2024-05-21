/**
 * Group a list of persons by their age
 * */
package streamapi.practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}
public class Problem3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("John", 25));
		list.add(new Person("Alice", 25));
		list.add(new Person("Bob",30));
		
		Map<Integer, List<Person>> personByAge = 
				list.stream()
				.collect(Collectors
						.groupingBy(p -> p.getAge()));
		
		personByAge.forEach((a,p) -> System.out.print(a + "=" + p.toString()));
	}

}


