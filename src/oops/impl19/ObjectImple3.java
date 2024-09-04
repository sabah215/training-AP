/**
 * 
 * Object Class : Every wrapper class override equals method
 * */

package oops.impl19;

public class ObjectImple3 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1 == s2) System.out.println(true);
		else System.out.println(false);
		
		if(s1.equals(s2)) System.out.println(true);
		else System.out.println(false);
	}
}
