/**
 * Printing key values by traversing each row
 * 
 * */
package collections.collection5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map  = new HashMap<>();
		map.put("Java", 5);
		map.put("C", 4);
		map.put("C++", 3);
		map.put("Go", 4);
		map.put("C#", 1);
		
		System.out.println(map);
		
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
		}
	}

}
