/**
 * Problem 6: Count the Occurrences of a Specific Character in a String
			  Write a function that takes a string and a character as input 
			  and returns the number of occurrences of that character in the string.

				Input: "hello world" and a character (e.g., "o") 
				Output: 'o' occurred 2 times in the entered string.

@author Sabah
@version 1.0
@date 04-18-2024
*/

package stringhandling;

public class CountOccuranceOfSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello world";
		System.out.println(countOccurances(s, 'z'));
	}
	
	public static String countOccurances(String s, char ch) {
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c == ch)
				count++;
		}
		return "'" + ch + "' occurs " + count + " times in the entered string.";
	}

}
