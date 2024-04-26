package arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3, 7, 1, 9, 5, 4, 2};
		System.out.println(selectionSort(arr));

	}
	
	public static String selectionSort(int [] arr) {
		
		int n = arr.length;
		
		for(int i = 0; i< n-1; i++) {
			/*** 
			 * Tracking of sorted part starts
			 	 minimum index starts with i = 0
			 */
			int minI = i;	
			
			for(int j = i+1; j< n; j++) {
				/*** Tracking of unsorted part starts
					from the unsorted part.
					j checks if there exists a value less than 
					minI element.
					Set j to minI if arr[j] < arr[minI] 
				 * 
				 */
				if(arr[j] < arr[minI])
					minI = j;
			}
			/*** 
			 * swap minimum index element with ith element.
			 * 
			 */
			int temp = arr[minI];
			arr[minI] = arr[i];
			arr[i] = temp;
		}
		return Arrays.toString(arr);
	}

}
