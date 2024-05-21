/**
 * Intermediate Operations in Stream API
 * */
package streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		// removing vowels from string
		String string1="Hello";
		Stream<Character> charstream = string1.chars().mapToObj(s -> (char) s);
		//charstream.filter(c -> (c != 'e') && (c !='o')).forEach(System.out::println);
		
		// 2.
		// converting integer values
		String s2 = Stream.of(1, 2, 3, 4, 5).map(String::valueOf).collect(Collectors.joining());
	//	System.out.println(s2);
		
		// 3. Count number of elemens
		long count = Stream.of(1,2,3, 6,7).count();
	//	System.out.println(count);
		
		// 4.
		// retrieve first 2 even numbers
		Stream.of(1, 3, 2, 12, 6, 7).filter(n -> n % 2 == 0).forEach(System.out::println);
		
		// 5.
		// remove duplicate elements from collection
		Integer [] arrayunique = Stream.of(1, 2, 3, 4, 5, 3, 1, 6, 2, 7).distinct().toArray(Integer[]::new);
		System.out.println(Arrays.toString(arrayunique));
	}
}
