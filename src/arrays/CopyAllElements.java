/**
 * Problem 8: Java Program to Copy All Elements of One Array into Another Array
 * Write a Java program that takes two arrays as input and copies all elements of the first array into the second array.
 * 
 * Input: Two arrays, e.g., [3, 7, 1, 9, 5] and [0, 0, 0, 0, 0] 
 * Output: The second array after copying: [3, 7, 1, 9, 5]
 * 
 * @author Sabah Ummie
 * @version 1.0
 * @date 04-21-2024
 * 
 * */
package arrays;

import java.util.Arrays;

public class CopyAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 7, 1, 9, 5};
		
		System.out.println(copyAll(arr));
	}
	public static String copyAll(int [] a) {
		 int [] b = Arrays.copyOf(a, a.length);
		return Arrays.toString(b);
	}
}
