/**
 * 
 * @author Sabah Ummie
 * @version 1.0
 * @date 04-18-2024
 * 
 * Problem 8: Remove All Whitespace Characters from a String
			  Write a function that takes a string as input and 
			  removes all the whitespace characters, returning the 
			  modified string.

			  Input: "hello world" 
			  Output: "helloworld"



*/
package stringhandling;

public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello world";
		System.out.println(replaceSpace(s));
	}
	
	public static String replaceSpace(String s) {
		String [] st = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String p : st) {
			sb.append(p);
		}
		return sb.toString();
	}

}

// Time O(n)
// Space O(n)