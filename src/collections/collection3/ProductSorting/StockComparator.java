package collections.collection3.ProductSorting;

import java.util.Comparator;

public class StockComparator implements Comparator<Product>{

	/**
	 * Compares product quantity in ascending order
	 * If there are same quantity for two or more 
	 * products it will sort in alphabetical order.
	 * */
	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.getQuantity() > p2.getQuantity()) return 1;
		else if(p1.getQuantity() < p2.getQuantity()) return -1;
		else return p1.getName().compareTo(p2.getName());
	}

}
