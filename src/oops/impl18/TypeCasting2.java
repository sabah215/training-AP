/**
 * Boxing , AutoBoxing, UnBoxing
 * 
 * */
package oops.impl18;

public class TypeCasting2 {

	public static void main(String[] args) {
		
		int x = 10;
		
		// Boxing
		Integer integerBoxed = new Integer(x);
		System.out.println(integerBoxed);
		
		// Autoboxing
		Integer integerAutoBoxed1 = 10;
		Integer integerAutoBoxed2 = x;
		System.out.println("Autoboxing value: " +integerAutoBoxed2);
		
		// Unboxing
		Integer integerUnboxed = new Integer(11);
		int unboxedInteger = integerUnboxed;
		System.out.println(unboxedInteger);
		
		// Unboxing while comparison
		if(x < unboxedInteger) {
			System.out.println("x is less than unboxed value");
		}
		else System.out.println("x is greater than equal to unboxed value.");
	}
}
