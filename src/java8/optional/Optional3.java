package java8.optional;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) {
		
		Optional<Integer> optionalNumber = Optional.ofNullable(getNumber());
		Optional<Integer> filtered = optionalNumber.filter(n -> n > 0);
		
		if(filtered.isPresent()) {
			System.out.println("Positive Number :" + filtered.get());
		}
		else {
			System.out.println("Negative Number :" + filtered.get());
		}
	}
	
	public static Integer getNumber() {
		return -5;
	}

}
