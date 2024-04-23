/*
 * Implementation of  method Overriding
 * @author Sabah Ummie
 * @version 1.0
 * @date 04-11-2024 
 * */
package oops.impl9;


/*
 * Implement Vehicle as Base class
 * Implement Car as child classes
 * Implemented methods: 
 * 		getWheels() for Car respectively 
 * 
 * */

class Vehicle {
	public void getWheels() {
		System.out.println("Method returns number of wheels in a vehicle");
	}
}

class Car extends Vehicle {
	public void getWheels() {
		System.out.println("Car is a 4 wheeler");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example 1: Child class method called
		Car car = new Car();
		car.getWheels();
		
		// Example 2: Parent class method called
		Vehicle v = new Vehicle();
		v.getWheels();
		
		// Example 3: Dynamic Binding: Parent class reference created and Child class method called.
		Vehicle v2 = new Car();
		v2.getWheels();
	}
}
