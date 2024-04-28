package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 2, 3, 4, 6, 7, 8, 9};
		
		System.out.println(findMissingNumber(arr));

	}
	
	public static String findMissingNumber(int [] arr) {
		// store the first element of the sequence
		int n = arr[0];
		
		// from 2nd element onward check if the current number is increased by 1 from the previos number
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != n + 1)
				return "Missing number is " + (n + 1);
			n++;
		}
		return "No number missing in the sequence";
	}

}
