package oops.impl16;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Aircraft aircraft = new Aircraft();
		aircraft.setHeight(50000);
		
		aircraft.fly();
		aircraft.speedUp();
		aircraft.slowDown();
		System.out.println("----------------------------------");
		// defaults
		aircraft.maintainMinHeight(30000);
		aircraft.startAutoPilot();
		aircraft.maintainMinHeight(20000);
		System.out.println("-----------------------------------");
		aircraft.land("Aircraft");
		System.out.println(Flyable.land(10));
		
	}
}

class Aircraft implements Flyable, AutoPilot {
	
	private int minHeight;
	
	public Aircraft() {}
	
	public Aircraft(int minHeight) {
		this.minHeight = minHeight;
	}
	
	public int getHeight() {
		return minHeight;
	}
	
	public void setHeight(int minHeight) {
		this.minHeight = minHeight;
	}
	
	// interface implemntations
	public void fly() {
		System.out.println("Aircraft is flying...");
	}
	
	public void speedUp() {
		System.out.println("Aircraft is speeding up...");
	}
	
	public void slowDown() {
		System.out.println("Aircraft is slowing down...");
	}

	/**
	 * a class implements several interfaces that define the same default methods. Diamond problem occurs
	 * 
	 * https://www.baeldung.com/java-static-default-methods
	 * 
	 * To overcome this the implementing class can either define its own implementation by overriding the default method from the interface
	 * or it can get the specific implementation as follows
	 * */
	
	@Override
	public void startAutoPilot() {
		// custom implementation
		System.out.println("Start Autopilot from Aircraft class");
	}
	
	@Override
	public  void stopAutoPilot() {
		// use default method implementation from specific interface
		Flyable.super.stopAutoPilot();
	}
	
	public void land(String name) {
		Flyable.land(name);
	}
	
	public int land(int val) {
		return val;
	}
}

interface AutoPilot{
	
	default void startAutoPilot() {
		System.out.println("Auto pilot mode on...");
	}
	
	default void stopAutoPilot() {
		System.out.println("Auto pilot mode off...");
	}
}

interface Flyable{
	
	// regular method declaration
	void fly();
	
	void speedUp();
	
	void slowDown();
	
	// default method declaration
	default void maintainMinHeight(int minHeight) {
		System.out.println(minHeight + " ft height maintained.");
	}
	
	default void startAutoPilot() {
		System.out.println("Auto pilot mode on...");
	}
	
	default void stopAutoPilot() {
		System.out.println("Auto pilot mode off...");
	}
	
	static void land(String name) {
		System.out.println(name + " is landing");
	}
	
	static int land(int val) {
		return val;
	}
}
