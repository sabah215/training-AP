/**
 * Use of Generics
 * 
 * */
package collections.collection1;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * -> List allows duplicate values
		 * -> Order or insertion is maintained
		 * */
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(5);
		nums.add(10);
		nums.add(1);
		/*** 
		 * -> Allows null value.
		 * */
		nums.add(null);
		
		/***
		 * Uses index to uniquely identify elements
		 * 
		 * */
	
		System.out.println(nums.get(3));
		
		System.out.println(nums);
		
	}

}
