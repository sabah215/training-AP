/**
 * Problem 4: Java Program to Print the Largest Element in an Array
 * Write a Java program that takes an array as input and prints the largest element in the array.
 * 
 * Input: An array, e.g., [3, 7, 1, 9, 5] 
 * Output: The largest element is 9
 * 
 * 	@author Sabah Ummie
 *	@version 1.0
 *	@date 04-21-2024
 * */
package arrays;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class LargestElementInAnArray {
	
	public static int min = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 7, 1, 9, 5};
		System.out.println(getLargest(arr));
		System.out.println(getLargestUsingTreeSet(arr));
	}
	
	public static int getLargest(int [] arr) {
		
		// Set max to a minimum value;
		 int max = min;
		 
		 // keep aasigning the max number
		 for(int n : arr) {
			 max = Math.max(max, n);
		 }
		 return max;
	}
	
	public static int getLargestUsingTreeSet(int [] arr) {
		 NavigableSet<Integer> set = new TreeSet<>();
		 for(int n : arr) {
			 set.add(n);
		 }
		 return set.pollLast();
	}
}
