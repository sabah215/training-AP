/**
 * Count the occurrences of each word in a sentence
 * */

package streamapi.practiceproblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hello world hello";
		
		Stream.of(sentence.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.forEach(entrySet -> System.out.println(entrySet.getKey() + " " + entrySet.getValue()));
	}

}
