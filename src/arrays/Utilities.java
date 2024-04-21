package arrays;

import java.util.Arrays;
import java.util.List;

public class Utilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,6,10,4,9,5};
		Integer[] sourceArray = { 3,4,6,10,4,9,5 };
		List<String> names = Arrays.asList("John", "Mary", "Danniel", "Kate", "James");
		int [] arr2 =  new int [6];
		String [] names2 = {"John", "Mary", "Danniel", "Kate", "James"};
		
		// Example 1: Printing arrays as String
		String arraysAsString = Arrays.toString(arr);
		System.out.println(arraysAsString);
		System.out.println();
		
		
		// Example 2a.: Using AsList method of Array.
		// It takes Integer [] array as input.
		
		List<Integer> list = Arrays.asList(sourceArray);
		System.out.println(list);
		System.out.println();
		
		// Example 2b.: Using AsList method of Array.
		// It takes String [] array as input.
		System.out.println(Arrays.asList(names));
		
		// Example 3: Using Stream API
		names.stream().forEach(System.out::println);
		System.out.println();
		
		// Example 4: Sort int array
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		//System.out.println();
		
		// Example 5: Binary Search on sorted list
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println();
		
		// Example 6: Fill an empty array with number.
		Arrays.fill(arr2, 9);
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		// Example 7a.: Copying from one to another
		arr2 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		// Example 7b.: Copying String array
		String [] newNames = Arrays.copyOf(names2, 5);
		System.out.println(Arrays.toString(newNames));
		System.out.println();
		
		// Example 8: Array equality
		int [] a = {1, 2, 3};
		int [] b = {1, 2, 3};
		int [] c = {3, 4, 5};
		
		boolean areEqual = Arrays.equals(a, b);
		boolean areEqual2 = Arrays.equals(b, c);
		// check if a and b are equal
		System.out.println(areEqual);
		// check if b and c are equal
		System.out.println(areEqual2);
		
		
	}

}
