package collections.collection2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(5);
		linkedHashSet.add(10);
		linkedHashSet.add(9);
		linkedHashSet.add(6);
		linkedHashSet.add(1);
		linkedHashSet.add(15);
		System.out.println(linkedHashSet);
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(30);
		set.add(40);
		set.add(60);
		System.out.println(set);
		
		Set<Integer> aSet = new TreeSet<>(new CustomComparator());
		aSet.add(10);
		aSet.add(5);
		aSet.add(7);
		aSet.add(19);
		aSet.add(21);
		aSet.add(25);
		System.out.println("Custom Sorted "+aSet);
		
		
		
	}

}
