/**
 * List allows heterogenous items
 * 
 * */
package collections.collection1;
import java.util.ArrayList;

public class CustomArrayList1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * add heterogenous items to a list.
		 * 
		 * */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("John");
		list.add(3.5);
		list.add(true);
		
		System.out.println(list);
		
	}

}
