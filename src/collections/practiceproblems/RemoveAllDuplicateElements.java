/**
 * Problem 5: Remove all duplicates from the list collection ?
	Input: An array input: [2, 4, 3, 2, 6, 4, 8, 10, 3] 
	Output: Expected Output: [2, 4, 3, 6, 8, 10]

*/

package collections.practiceproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveAllDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(8);
		list.add(10);
		list.add(3);
		
		System.out.println(removeDuplicate(list));
		
	}
	
	public static List<Integer> removeDuplicate(List<Integer> list){
		
		HashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i:list) {
			if(set.contains(i))
				continue;
			
			else set.add(i);
		}
		
		List<Integer> uniqueList = new LinkedList<>();
		uniqueList.addAll(set);
		return uniqueList;
	}

}
