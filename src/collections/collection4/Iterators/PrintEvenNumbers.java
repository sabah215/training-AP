/**
 * Printing even numbers in a list using iterators.
 * */
package collections.collection4.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int n = itr.next();
			if(n % 2 == 0)
				System.out.print(n + " ");
		}
	}
}
