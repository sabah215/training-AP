/**
 * Constructor Implementation : Constructor Overloading 
 * Initializing class level properties
 * @author Sabah
 * @version 1.0
 */
package oops.impl12;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("Pen", 2.15, 10);
		Product p2 = new Product("Quinoa", 6.25);
		Product p3 = new Product("Rice");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
