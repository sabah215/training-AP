/**
 * Product List in a shop sorted in increasing number 
 * of quantity in stock.
 * If same quantity of two or more Product exist it 
 * will sort them in alphabetical order.
 * */
package collections.collection3.ProductSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Produc list added.*/
		List<Product> pList = new ArrayList<>();
		pList.add(new Product(111, "Cereal", 10));
		pList.add(new Product(112, "Unsalted Butter", 5));
		pList.add(new Product(113, "Pasta Sauce", 20));
		pList.add(new Product(114, "Salad Dressing", 16));
		pList.add(new Product(115, "Ranch", 7));
		pList.add(new Product(116, "Sour Cream", 12));
		pList.add(new Product(117, "Yogurt", 20));
		
		/**
		 * Product List sorted using Collections' sort() method. 
		 * */
		Collections.sort(pList, new StockComparator());
		for(Product p : pList) {
			System.out.println(p.toString());
		}
	}

}
