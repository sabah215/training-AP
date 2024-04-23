/**
 * Init block implementation
 * Initializing class level properties
 * @author Sabah
 * @version 1.0
 */
package oops.impl12;
import java.text.DecimalFormat;

public class Order {
	
	private String name;
	private int quantity;
	private double price;
	private static int MIN_ORDER;
	
	/*
	 * Static Block: executed once when the class is loaded into the memory only, but not executed with every instance created. 
	 * 
	 * */
	static {
			MIN_ORDER = 2;
			System.out.println("Minimum quantity of product ordered: " + MIN_ORDER);	
	}
	
	/*
	 * Init Block: Class level properties initialized every time an object of Order is created.
	 * 
	 * */
	{
		price = 20;
		System.out.println(this);
		System.out.println("Minimum price of product ordered: " + price);
		System.out.println("getTotalPrice() takes the unit price and returns the total price based on number of quantity.");
	}
	
	public Order(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Order(String name) {
		this.name = name;
	}
	
	public double getTotalPrice() {
		return quantity * price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Order o1 = new Order("Cereal", 3, 6.39);
		System.out.format("%.2f", o1.getTotalPrice());
		
		System.out.println();
		System.out.println();
		
		Order o2 = new Order("Rice", 2, 19.28);
		System.out.format("%.2f", o2.getTotalPrice());
		
		
	}

}
