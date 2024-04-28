package arrays;

import java.util.Arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4, 2, 10, 8, 7};
		System.out.println(getMaxDiff(arr));

	}
	
	public static int getMaxDiff(int [] arr) {
		
		// Time: O(n)
		// Space O(1)
		int max = Integer.MIN_VALUE;
		
		for (int i = 1; i < arr.length;i++) {
			int diff = Math.abs(arr[i] - arr[i-1]);
			max = Math.max(max, diff);
		}
		return max;
	}
	
	public static int getMaxDiffBySorting(int [] arr) {
		// Time: O(nlogn)
		// Space: O(1); 
		Arrays.sort(arr);
		int n= arr.length -1;
		return arr[n] - arr[0];
	}

}
