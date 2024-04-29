package arrays;

public class FindKthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4, 2, 10, 8, 7};
		System.out.println(findKthSmallestElement(arr, 3));
	}
	
	public static int findKthSmallestElement(int [] arr, int k) {
		
		int high = Integer.MIN_VALUE;
		int low = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			high = Math.max(high, arr[i]);
			low = Math.min(low, arr[i]);
		}
		
		while(low < high) {
			
			int mid = low + (high - low)/2;
			
			if(count(arr, mid) < k) {
				low = mid + 1;
			}
			else high = mid;
		}
		return low;
	}
	
	public static int count(int [] arr, int mid) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= mid)
				count++;
		}
		return count;
	}
}
