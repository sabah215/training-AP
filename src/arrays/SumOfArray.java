/**
 * Problem 7: Java Program to Print the Sum of All the Items of the Array
 * Write a Java program that takes an array as input and prints the sum of all the items in the array.
 * 
 * Input: An array, e.g., [3, 7, 1, 9, 5] 
 * Output: The sum of all items is 25

*/

package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3, 7, 1, 9, 5};
		System.out.println(getSum(arr));
	}
	
	public static int getSum(int [] arr) {
		int sum = 0;
		
		for(int n:arr) {
			sum+=n;
		}
		return sum;
	}
/**
 * Time O(n)
 * Space O(1)
 * 	*
 */
}
