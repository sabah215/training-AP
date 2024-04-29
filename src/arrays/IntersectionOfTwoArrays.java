package arrays;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {3, 2, 5, 8};
		int [] arr2 = {5, 2, 9};
		
		// took the minimum array size.
		// final array size will not be > minimum array size
		int minSize = Math.min(arr1.length, arr2.length);
		
		// counter to loop through the result array while inserting
		int k = 0;
		
		// insert the element in a temp array
		int temp [] = new int[minSize];
		
		
		for(int i = 0; i < arr1.length; i++ ) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					temp[k++] = arr1[i];
				}
			}		
		}
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] != 0)
				System.out.print(temp[i] + " ");
		}
	}
}
