package stringhandling;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "sabch";
		System.out.println(removeDuplicates(s));
	}
	
	public static String removeDuplicates(String s) {
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		s = s.toLowerCase();
		for(int i=0; i< s.length(); i++){
			if(!set.contains(s.charAt(i))) {
				sb.append(s.charAt(i));
			}	
			set.add(s.charAt(i));	
		}
		return sb.toString();
	}
}

// Time O(n)
// Space O(n)
