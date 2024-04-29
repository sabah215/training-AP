package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3, 2, 5, 2, 8, 5};
		System.out.println(removeDuplicates(arr));

	}
	
	public static String removeDuplicates(int [] arr) {
		
		int n = arr.length;
		boolean [] visited = new boolean[n];
		
		int [] res = new int[n];
		
		Arrays.fill(visited,  false);
	
		for (int i = 0; i < n; i++) {
			
			if(visited[i]) {
				continue;
			}
			res[i] = arr[i];
			for(int j = i + 1; j < n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					
				}
			}
		}
		return Arrays.toString(res);
	}

}
