package arrays;

import java.util.Arrays;

public class SeparateOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		separateOddAndEven(arr);
	}
	
	public static void separateOddAndEven(int [] arr) {
		int n = arr.length;
		int [] even = new int [n/2];
		int [] odd = null;
		
		if(n % 2 == 0) {
			odd = new int[n/2];
		}
		else {
			odd = new int[n/2 + 1];
		}
		
		int j = 0, k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
					even[j++] = arr[i];
			}
			else {
					odd[k++] = arr[i];
				}
			}
		
		System.out.println("Odd numbers: " + Arrays.toString(even) + ", Even numbers: " + Arrays.toString(odd));
	}

}
