/**
 * Conversion to stream
 * 
 * */
package streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		Arrays.asList(2, 3, 1, 4, 5, 3).stream();
		
		// 2.
		int [] arr = {1, 2, 3, 4, 5, 6};
		Arrays.stream(arr);
		
		// 3.
		String string = "hello";
		Stream<Character> stream = string.chars().mapToObj(s -> (char) s);
		
		stream.filter(c -> (c != 'e') && (c != 'o')).forEach(System.out::println);
		
		// 4.
		//Stream.of(1,2,3,4,5,6,7).forEach(System.out::println);
	}

}
