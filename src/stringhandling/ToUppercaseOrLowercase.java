/**
 * Problem 10: Convert a String to Uppercase or Lowercase
			   Write a function that takes a string and a flag 
			   indicating uppercase or lowercase conversion, and 
			   returns the modified string.

			   Input: A string, e.g., "Hello", and a flag indicating lowercase 
			   Output: Modified string in lowercase, e.g., "hello"
 * */
package stringhandling;

public class ToUppercaseOrLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		// 1 -> Uppercase
		// 0 -> Lowercase
		
		System.out.println(convertCase(s, 0));
	}
	
	public static String convertCase(String s, int flag) {
		StringBuilder sb = new StringBuilder();
		if(flag == 1) {
			sb.append(Character.toUpperCase(s.charAt(0)));
		}
		else {
			sb.append(Character.toLowerCase(s.charAt(0)));
		}
		for(int i=1; i< s.length(); i++) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
}
