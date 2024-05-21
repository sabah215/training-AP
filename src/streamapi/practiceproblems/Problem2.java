package streamapi.practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<>();
		strings.add("apple");
		strings.add("banana");
		strings.add("cherry");
		strings.add("date");
		List<String> uppercase = strings.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);
	}
	
}
