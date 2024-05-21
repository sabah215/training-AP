package java8.optional;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		
		Optional<String> optionalName = Optional.ofNullable(getName());
		String name = optionalName.orElse("Unknown");
		System.out.println("Name :" + name);

	}
	
	public static String getName() {
		return "John";
	}

}
