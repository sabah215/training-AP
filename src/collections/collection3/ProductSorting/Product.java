package collections.collection3.ProductSorting;

public class Product {
	
	private int productId;
	private String name;
	private int quantity;
	
	public Product(int productId, String name, int quantity) {
	
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId = " + productId + ", name = " + name + ", quantity = " + quantity + "]";
	}
}
