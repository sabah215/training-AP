/**
 * Problem 10: Binary Search
 * Write a Java program that takes a sorted array and a target element as input and performs binary search to find the index of the target element.
 * 
 * Input: A sorted array, e.g., [1, 3, 5, 7, 9], and target element 5 
 * Output: The index of 5 is 2
 * 
 * @author Sabah Ummie
 * @date 04-21-2024
 * @version 1.0
 * 
 * */
package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1, 3, 5, 7, 9};
		System.out.println(binarySearch(nums, 3));
	}
	
	public static String binarySearch(int [] arr, int target) {
		// Start index
		int s = 0;
		
		// last index
		int e = arr.length - 1;
		
		while(s <= e) {
			
			int m = s + (e - s)/2;
			 if(arr[m] == target) {
				 return "The index of " + target + " is " + m;
			 }
			 else if(arr[m] > target) {
				 e = m-1;
			 }
			 else {
				 s = m + 1;
			 }
		}
		
		return "Target not found";
	}

}
