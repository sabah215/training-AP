package arrays;

import java.util.Arrays;

public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		subArrayWithMaximumSum(arr);

	}
	
	public static void subArrayWithMaximumSum(int [] arr) {
		int n = arr.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            if(sum > max) {
            	max = sum;
            }
           
            
            if(sum<0) sum = 0;
        }
        System.out.println(max);
	}

}
