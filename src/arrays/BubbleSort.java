package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {3, 7, 1, 9, 5};
		System.out.println(bubbleSort(nums));
	}
	
	private static String bubbleSort(int [] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j= i+1; j < arr.length; j++) {
				if(arr[i] > arr[j])
					swap(arr, i, j);
			}
		}
		
		return Arrays.toString(arr);
	}
	
	public static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
