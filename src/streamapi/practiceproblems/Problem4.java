package streamapi.practiceproblems;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(Arrays.stream(arr).filter(n -> (n > 50)).average().getAsDouble());
		//System.out.println(average);
	}
}
