package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = {3, 2, 5, 8};
		int [] a2 = {5, 7, 9};
		
		unionOfTwoArrays(a1, a2);
	}
	
	public static void unionOfTwoArrays(int [] a1, int[] a2) {
		// Linked Hashset is used to maintain the insertion order.
		Set<Integer> set = new LinkedHashSet<>();
		
		// 
		for(int i = 0; i < a1.length; i++) {
			set.add(a1[i]);
		}
		
		for(int i = 0; i< a2.length; i++) {
			set.add(a2[i]);
		}
		
		System.out.println(set.toString());
	}
}
