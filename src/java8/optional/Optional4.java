package java8.optional;

import java.util.Optional;

public class Optional4 {

	public static void main(String[] args) {
		int userId = 42;
		
		Optional<User> optionalUser = findUserById(userId);
		User user = optionalUser.orElseThrow(() -> new UserNotFoundException("User not Found"));
		
		System.out.println("User Found : " + user.getName());
	}
	
	public static Optional<User> findUserById(int userId){
		if(userId == 42) {
			return Optional.of(new User(42, "Alice"));
		} else {
			return Optional.empty();
		}
	}

}
