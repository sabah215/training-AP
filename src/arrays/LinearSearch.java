/**
 * Problem 9: Linear Search
 * Write a Java program that takes an array and a target element as input and performs linear search to find the index of the target element.
 * 
 * Input: An array, e.g., [3, 7, 1, 9, 5], and target element 7 
 * Output: The index of 7 is 1
 * 
 * @author Sabah Ummie
 * @version 1.0
 * @date 04-21-2024
 *  
 * */

package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3, 7, 1, 9, 5};
		System.out.println(getTargetIndex(nums, 7));
	}
	
	public static String getTargetIndex(int [] nums, int target) {
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target)
				return "Element found at " + i + ".";
		}
		
		return "Element not found.";
	}
	

}
