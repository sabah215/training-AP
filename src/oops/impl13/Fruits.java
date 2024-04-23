package oops.impl13;
// put commnts
class Product{
	private String pName;
	
	public Product(String pName) {
		this.pName = pName; 
	}
	
	public Product() {
		super();
	}
	
	public String getName() {
		return pName;
	}
}
public class Fruits extends Product{
	//private String fName;
	private double price;
	private int quantity;
	
	
	public Fruits(String fName, double price, int quantity) {
		super(fName);
		this.price = price;
		this.quantity = quantity;
	}
	
	public Fruits (double price, int quantity) {
		super("Apple");
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return quantity * price;
	}
	
	public void printFruit() {
		System.out.println(getName() + " " + price + " " + quantity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits f = new Fruits("Orange", 3.19, 10);
		f.printFruit();
		System.out.println(f.getPrice());
		
		System.out.println();
		
		Fruits f2 = new Fruits(2.43, 5);
		f2.printFruit();
		System.out.println(f2.getPrice());		
	}

}
