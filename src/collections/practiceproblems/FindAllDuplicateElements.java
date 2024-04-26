package collections.practiceproblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindAllDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 2, 3, 2, 1, 3, 4, 5};
		System.out.println(findAllDuplicates(arr));
	}
	
	public static String findAllDuplicates(int [] arr) {
		
		Map<Integer, Integer> map = new TreeMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else map.put(arr[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				list.add(entry.getKey());
			}
		}	
		Collections.sort(list);
		return list.toString();
	}
}
