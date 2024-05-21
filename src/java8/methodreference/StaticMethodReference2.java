/**
 * Predefine Static Method Reference implementation - 
 * @author Sabah
 * @version 1.0
 */
package java8.methodreference;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Mysquarefunction {
	int square(int n);
}


public class StaticMethodReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
		numbers.stream().map(Integer::parseInt).forEach(System.out::println);
	}

}
