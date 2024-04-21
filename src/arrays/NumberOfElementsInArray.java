/**
 * Problem 6: Java Program to Print the Number of Elements Present in an Array
 * Write a Java program that takes an array as input and prints the number of elements present in the array.
 * 
 * Input: An array, e.g., [3, 7, 1, 9, 5] 
 * Output: The number of elements is 5
 * 
 * @author Sabah Ummie
 * @date 04-21-2024
 * @version 1.0
 * 
 * */
package arrays;

public class NumberOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {3, 7, 1, 9, 5};
		System.out.println(getNumberOfElements(arr));
	}
	public static int getNumberOfElements(int [] arr) {
		 return arr.length;
	}
}
