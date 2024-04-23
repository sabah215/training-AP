/**
 * This is a programming exercise from the book Absolute Java 
 * This is to create an example of dynamic binding.
 * 
 * @author Sabah Ummie
 * @date 04-19-2024
 * @version 1.0
 * */
package oops.impl16.employeesalary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(101, "John", "Sales", 25000, "salesman");
		System.out.println(emp.toString());
		System.out.println("Salary with bonus: " + emp.addBonus());
		System.out.println();
		
		Employee man = new Manager(111, "Sam","Technology", 30000, "tech_manager"); 
		System.out.println(man.toString());
		System.out.println("Salary with bonus: " + man.addBonus());
		System.out.println();
		
		Employee ck = new Clerk(112, "Daniel", "Accounts", 10000, "clerk");
		System.out.println(ck.toString());
		System.out.println("Salary with bonus: " + ck.addBonus());

	}

}
