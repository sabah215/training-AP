/**
 * Problem 2: Java Program to Print the Elements of an Array in Reverse Order
	Write a Java program that takes an array as input and prints its elements in reverse order.

	Input: An array, e.g., [3, 7, 1, 9, 5] 
	Output: 5, 9, 1, 7, 3
	*/
package arrays;

import java.util.Arrays;
import java.util.Stack;

public class PrintInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2, 3, 9, 4, 6};
		
		// Solution using two pointer
		System.out.println(getReverseUsingTwoPointer(arr));
		
		// Solution using two pointer
		System.out.println(getReverseUsingStack(arr));
	}
	
	public static String getReverseUsingTwoPointer(int [] arr) {
		// Starting from left most element
		int l = 0;
		// Starting from the right most element
		int r = arr.length - 1;
		
		/**
		 * Keep swapping until l < r.
		 * */
		while(l < r) {
			// keep swapping first and last elements
			swap(arr, l, r);
			
			// increase the left pointer
			l++;
			// decrease the left pointer
			r--;
		}
		
		return Arrays.toString(arr);
	}
	
	public static void swap(int [] a, int l, int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
	
	public static String getReverseUsingStack(int [] arr) {
		Stack<Integer> st = new Stack();
		int n = arr.length;
		
		// return the reversed array
		int [] rev = new int[n];
		
		// push elements to the stack from first to last index of array
		for(int num : arr) {
			st.push(num);
		}
		
		// pop elements from stack and add to the result array
		for(int i = 0; i < rev.length; i++) {
			rev[i] = st.pop();
		}
		return Arrays.toString(arr);
	}
}
