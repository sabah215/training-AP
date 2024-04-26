package collections.practiceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddAndRemoveUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(9);
		list.add(5);
		System.out.print(list + " ");
		System.out.println();
		add(list);
		System.out.print(list +" ");
		remove(list);
		System.out.println();
		System.out.print(list +" ");
	}
	
	public static void add(List<Integer> list) {
		
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			if(itr.next() == 1)
				itr.add(10);
		}
	}
	
	public static void remove(List<Integer> list) {
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			if(itr.next() == 7) {
				itr.remove();
			}
		}
	}
	
	public static void remove() {
		
	}

}
