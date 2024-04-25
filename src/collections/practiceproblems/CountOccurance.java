/**
 * Count the frequency of numbers in  an array
 * 
 * */
package collections.practiceproblems;

import java.util.HashMap;
import java.util.Map;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 2, 3, 2, 1, 3, 4, 5};
		System.out.println(countOccurance(arr));
	}
	
	public static Map<Integer, Integer> countOccurance(int [] arr){
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			// check if key is present
			// if yes, then get the value and increase by 1
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			
			// if not then insert with frequency 1
			else map.put(arr[i], 1);
		}
		return map;
	}
}
