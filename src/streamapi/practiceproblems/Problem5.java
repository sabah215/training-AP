/**
 * Find the longest string in a list
 * */
package streamapi.practiceproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
		System.out.println(list.stream().max((p1,p2) -> Integer.compare(p1.length(), p2.length())));
	}

}
