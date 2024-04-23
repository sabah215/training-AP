/**
 * All methods of List
 * */
package collections.collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(5);
		System.out.println(list);
		/**
		 * Check if element exists
		 * */
		System.out.println("check if element exists: "+list.contains(5));
		
		/**
		 * remove an element
		 * */
		list.remove(1);
		System.out.println(list);
		
		/**
		 * Adding String items to list.
		 * */
		List<String> greet  = new ArrayList<>();
		greet.add("Hello");
		greet.add("world");
		greet.add("Bye");
		System.out.println(greet);
		
		List<String> names  = new ArrayList<>();
		names.add("Mary");
		names.add("Sam");
		names.add("Daniel");
		
		/**
		 * Add one collection (list) to the other.
		 * */
		greet.addAll(names);
		System.out.println(greet);
		
		/**
		 * Replace one element with another.
		 * */
		try {
			greet.set(1, "All");
			System.out.println(greet);
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		/**
		 * Convert the greet list to array
		 * */
		String [] array = new String [greet.size()];
		greet.toArray(array);
		
		/**
		 * Printing an array
		 * */
		System.out.println("Printing String Array:");
		for(String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}

}
