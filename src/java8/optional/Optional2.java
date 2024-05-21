/**
 * Demonstrates Chaining Operations with optional object
 * @author Sabah
 * @version 1.0
 */

package java8.optional;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		
		Optional<String> maybeName = Optional.ofNullable(getName());
		String result = maybeName.map(String::toUpperCase).orElse("No Name Provided");
		System.out.println(result);
	}
	
	public static String getName() {
		return "Alice";
	}

}
