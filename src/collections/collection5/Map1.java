package collections.collection5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map  = new HashMap<>();
		map.put("Java", 5);
		map.put("C", 4);
		map.put("C++", 3);
		map.put("Go", 4);
		map.put("C#", 1);
		
		System.out.println(map);
		
		
		// Get all keys 
		Set<String> lang = map.keySet();
		System.out.println(lang);
		
		// Get all values
		Collection<Integer> val = map.values();
		System.out.println(val);
		
		// Update a value
		map.put("C#", 2);
		System.out.println(map);
		
		
	}
}
