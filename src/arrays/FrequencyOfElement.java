/**
 * Problem 1: Java Program to Find the Frequency of Each Element in an Array.
 * Write a Java program that takes an array as input and prints the frequency of each element in the array.
 * Input: An array, e.g., [1, 2, 2, 3, 1, 4, 5] 
 * Output: Element 1 occurs 2 times, Element 2 occurs 2 times, Element 3 occurs 1 time, Element 4 occurs 1 time, 
 * 		   Element 5 occurs 1 time
	
*
*	@author Sabah Ummie
*	@version 1.0
*	@date 04-21-2024
*
*/
package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Get the frequency of each element in an integer array.
		 * */
		int [] arr = {1, 1, 2, 3, 3};
		getFrequencyOfElementsUsingBruteForce(arr);
		getFrequencyOfElements(arr);
	}
	
	public static void getFrequencyOfElementsUsingBruteForce(int [] arr) {
		/**
		 * Using Brute force
		 * Time O(n^2)
		 * Space O(n)
		 * */
		
		int n = arr.length;
		
		/** 
		 * create a boolean type visited array that will keep track of if an element's 
		 * frequency is already counted or not.
		 * This is tracked while the j index is loops through the array.
		 * **/
		
		boolean [] visited = new boolean[n];
		// Since all the elements are unvisited.
		Arrays.fill(visited, false);
		
		/**
		 * Next we will loop through each element and check equality 
		 * with the following elements. 
		 * 
		 * */
		for(int i = 0; i < n; i++) {
			
			/**
			 * First check if the index is visited or not.
			 * If visited stop executing rest of the program and move to 
			 * next ith element.
			 */
			if(visited[i] == true)
				continue;
			
			// if not then
			int count = 1;
			/**
			 * Now loop through the rest of the elements and check 
			 * if the element at i exists or not.
			 * 
			 * */
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println("Element "+ ++i + " occurs " +count + " times, ");
		}	
	}
	
	public static void getFrequencyOfElements(int [] a) {
		/**
		 * Using Hashmap
		 * Time - O(n)
		 * Space - O(n)
		 * 
		 * */
		// variable to keep track of the frequency of each element
		int freq = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		/**
		 * Traverse through each element and add the number of occurance as value
		 * 
		 * */
		for(int n : a) {
			if(map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			}
			// start adding with frequency 1 if no key exists
			else map.put(n,1);
		}
		int i = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Element "+ ++i + "occurs " +entry.getValue() + "times, ");
		}
	}
}
