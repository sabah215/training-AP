package collections.collection2;

import java.util.Comparator;

/**
 * */
public class CustomComparator implements Comparator<Integer>{
	
	/**Overrides compare method to sort in descending order*/
	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		if(a > b) return -1;
		if(a < b) return 1;
		else return 0;
	}


}
