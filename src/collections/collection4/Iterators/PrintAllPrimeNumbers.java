/**
 * Print all prime numbers in a list
 * 
 * */
package collections.collection4.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int n = itr.next();
			if(isPrime(n))
				System.out.print(n + " ");
		}
	}
	
	public static boolean isPrime(int n) {
		// 1 and any number < 1 is not prime.
		if(n <= 1) return false;
		// starting from 2 till the number n we need to check:
		int i = 2;
		
		// until i^2 is < n
		while(i * i < n) {
			if(n % i == 0)
				return false;
			i++;
		}
		return i * i > n;
	}
}
