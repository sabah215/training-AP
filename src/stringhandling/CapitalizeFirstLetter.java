package stringhandling;

import java.util.StringTokenizer;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "i am a girl.";
		System.out.println(capitalize(s));
	}
	
	public static String capitalize(String s) {
		StringTokenizer st = new StringTokenizer(s);
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			String next = st.nextToken();
			String token = "";
			if(!Character.isUpperCase(next.charAt(0))) {
				char first = Character.toUpperCase(next.charAt(0));
				token = String.valueOf(first);
				for(int i=1; i < next.length(); i++) {
					token = token + next.charAt(i);
				}
			sb.append(token+" ");	
			}
			else sb.append(next +" ");
		}
		return sb.toString();
	}
}

// Time O(n^2)