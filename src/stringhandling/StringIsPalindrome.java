package stringhandling;

public class StringIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "radar";
		
		// using two pointer
		// Time O(n) Space O(1)
		System.out.println(isPalindrome(s));
		
		// using a second variable
		// Time O(n) Space O(1)
		System.out.println(isPalindrome2(s));
	}
	
	public static String isPalindrome(String s) {
		
		s = s.toLowerCase();
		int l = 0;
		int r = s.length() - 1;
		
		while(l < r) {
			if(s.charAt(l) == s.charAt(r)) {
				l++;
				r--;
			}
			else return "Entered string is not a palindrome.";
		}
		return "Entered string is a palindrome.";
	}
	
	public static String isPalindrome2(String s) {
		s = s.toLowerCase();
		String rev = "";
		
		for(int i = s.length() -1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev))
			return "Entered string is a palindrome.";
		else return "Entered string is not a palindrome.";
	}

}
