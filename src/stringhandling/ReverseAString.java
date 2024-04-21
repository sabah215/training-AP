/**
 * Write a function that takes a string as input and returns the reverse of that string.
   Input: "hello" 
   Output: "olleh"
 * */
package stringhandling;

import java.util.Arrays;
import java.util.Stack;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		System.out.println(reverseUsingTwoPointers(s));
		System.out.println(reverseUsingStack(s));
	}
	
	// Reverse using two pointers
	public static String reverseUsingTwoPointers(String s) {
		// Time: O(n), Space: O(n)
		StringBuilder sb = new StringBuilder();
		char [] arr = s.toCharArray();
		int l = 0;
		int r = arr.length - 1;
		
		while(l <= r) {
			swap(arr, l, r);
			l++;
			r--;
		}
		sb.append(arr);
		return sb.toString();
	}
	
	public static void swap(char [] arr, int l, int r) {
		char temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	
	// Reverse using Stack
	public static String reverseUsingStack(String s) {
		// Time: O(n), Space: O(n)
		Stack<Character> st = new Stack();
		StringBuilder sb = new StringBuilder();	
		for(char ch : s.toCharArray()) {
			st.push(ch);
		}
		while(!st.isEmpty()) {
			for(int i = 0; i < st.size(); i++) {
				sb.append(st.pop());
			}
		}	
		return sb.toString();
	}
}
