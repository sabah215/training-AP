package stringhandling;
import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfACharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		countOccurance(s);
	}
	// Time: O(n) Space O(n)
	public static void countOccurance(String s) {
		HashMap<Character, Integer> map = new HashMap();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				int val = map.get(c);
				map.put(c,++val);
			}
			map.putIfAbsent(c, 1);
		}		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-"+entry.getValue());
		}
	}
}
