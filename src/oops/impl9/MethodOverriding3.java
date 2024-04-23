/**
 * Implementation of method overriding by changing access modifiers.
 * @version 1.0
 */
package oops.impl9;

class Employee {
	protected void getSalary() {
		System.out.println("Base salary is 20000");
	}
}

class FullTime extends Employee{
	public void getSalary() {
		System.out.println("Full-time salary is 35000");
	}
}
public class MethodOverriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Protected method is used within same package and within extended child class
		// Example 1: 
		Employee emp = new Employee();
		emp.getSalary();
		
		// Example 2: 
		FullTime emp2 = new FullTime();
		emp2.getSalary();
		
		// Example 3: 
		Employee emp3 = new FullTime();
		emp3.getSalary();
	}

}
