package collections.collection3.EmployeeSorting;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new TreeSet<Employee>(new CustomComparator());
		set.add(new Employee(101, "John", 30000));
		set.add(new Employee(102, "Martha", 40100));
		set.add(new Employee(103, "Sarah", 20000));
		set.add(new Employee(104, "Daniel", 30000));
		set.add(new Employee(104, "Bob", 50000));
		set.add(new Employee(101, "Alice", 27000));
		System.out.println("Sored Employees: "+set);
	}
}
