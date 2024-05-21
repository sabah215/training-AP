/**
 *  Find the sum of all odd numbers in an array
 *  
 *  */
package streamapi.practiceproblems;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = Arrays.stream(arr).filter(n -> n%2 != 0).sum();
		System.out.println(sum);
	}

}
