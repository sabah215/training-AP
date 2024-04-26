package collections.practiceproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapOnValues {
	
	class CustomComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer i1, Integer i2) {
			// TODO Auto-generated method stub
			if(i1 < i2) return 1;
			else if(i1 > i2) return -1;
			else return 0;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 3);
		map.put("banana", 7);
		map.put("cherry", 1);
		map.put("date", 9);
		map.put("fig", 5);
		
		System.out.println(sortByValue(map));
	}
	
	public static Map<String, Integer> sortByValue(Map<String, Integer> map){
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}	
		});
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> e : list) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		return sortedMap;
	}
	
}
