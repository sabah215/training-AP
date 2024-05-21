/**
 * Terminal Operation in Stream API
 * */
package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(Collectors.toList());
		System.out.println(list);
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
		
		// 2.
		Set<Integer> set = Stream.of(8, 2, 1, 3, 4, 5, 3, 6, 7).collect(Collectors.toSet());
		System.out.println(set);
		
		// 3.
		ArrayList<Integer> arrayList = Stream.of(1,2,3,4,5,6,7).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arrayList);
		
		// 4.
		Integer [] a = Stream.of(1, 2, 3, 4, 5, 6, 7).toArray(Integer[]::new);
		System.out.println(Arrays.toString(a));
		
		// 5.
		String s1 = Stream.of("Hello", "Hi","Bye").collect(Collectors.joining());
		System.out.println(s1);
	}
}
