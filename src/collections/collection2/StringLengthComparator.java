/**
 * Custom Comparator created to sort String values based on their length in descending order
 * 
 * @author Sabah
 * @date 04-23-2024
 * @version 1.0
 * 
 * */
package collections.collection2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator implements Comparator<String>{
	
	@Override
	public int compare(String a, String b) {
		/**
		 * If a's length is greater than b it will return a negative value.
		 * */
		return b.length() - a.length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * List of Names created
		 * */
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Daniel");
		names.add("Margarett");
		names.add("Chris");
		names.add("James");
		
		/**
		 * Names sorted in Descending order
		 * compare() returns a negative value which indicates sorting in descending order
		 * */
		System.out.println(new StringLengthComparator().compare("Daniel", "margarette"));
		/**
		 * sort() takes a comparator parameter and sorts the elements based on the 
		 * compare() method in StringLengthComparator class
		 * */
		names.sort(new StringLengthComparator());
		System.out.println(names);		
	}
}
