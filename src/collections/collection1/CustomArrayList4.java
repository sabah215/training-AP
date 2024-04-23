/**
 * Looping of collection
 * @author Sabah
 * @version 1.0
 */
package collections.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Mary");
		names.add("Shelly");
		names.add("Cathy");
		
		/**
		 * Iterating list using for loop
		 * */
		for(String val : names) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		/**
		 * Iterating through for loop 
		 * */
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		/**
		 * Iterate list using Stream API
		 * */
		names.stream().forEach(System.out::println);
	}

}
