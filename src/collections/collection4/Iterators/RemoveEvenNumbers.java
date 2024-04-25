package collections.collection4.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> odds = removeEven(list);
		System.out.println(odds);
	}
	public static List<Integer> removeEven(List<Integer> list){
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {		
			if(itr.next() % 2 == 0) {
				itr.remove();
			}
		}
		return list;
	}
}
