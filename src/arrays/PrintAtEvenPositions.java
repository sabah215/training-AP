/**
 * Problem 3: Java Program to Print the Elements of an Array Present on Even Positions
 * Write a Java program that takes an array as input and prints the elements of the array present on even positions.
 * 
 * Input: An array, e.g., [3, 7, 1, 9, 5] 
 * Output: 7, 9
 * 
 * 	@author Sabah Ummie
 *	@version 1.0
 *	@date 04-21-2024
 *
 **/

package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAtEvenPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3, 7, 1, 9, 5};
		System.out.println(getEvenPositionedElements(arr));
	}
		
	public static String getEvenPositionedElements(int [] a) {
		
		List<Integer> list = new ArrayList<>();
		
		/** Starting from the second element check if i % 2 == 1
		 *  This indicated that in a 0 indexed array the odd indexed positions are even positioned elements.
		 *  */
		for(int i = 1; i< a.length; i++) {
			if(i % 2 == 1) {
				list.add(a[i]);
			}
		}
		return list.toString();
	}
}
