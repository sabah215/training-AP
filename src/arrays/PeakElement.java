package arrays;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 3, 5, 2, 4, 6, 8};
		System.out.println(getPeakValue(arr));
	}
	
	public static int getPeakValue(int [] arr) {
		
		int n = arr.length;	 
		
		// checks if firstelement is the peak
		//if(arr[0] >= arr[1]) return arr[0];
		
		// check if lass element is the peak
		//if(arr[n-1] >= arr[n-2]) return arr[n-1];
		
		// check for peak from the 2nd element to the 
		// second last element.
		for(int i=1; i<arr.length-1; i++) {
			// check if previous and the next elements are smaller
			if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
				return arr[i];
			}
		}
		// if a single element is in the array
		return arr[0];
	}

}
