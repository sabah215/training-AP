package arrays;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3, 7, 1, 9, 5};
		
		System.out.println(getSecondLargestNumber(arr));
	}
	
	public static int getSecondLargestNumber(int [] arr) {
		
		Arrays.sort(arr);
		return arr[arr.length - 2];
	}

}
