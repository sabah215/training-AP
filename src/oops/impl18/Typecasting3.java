package oops.impl18;

public class Typecasting3 {

	public static void main(String[] args) {

		double y = 11.5;
		int x = (int) y;
		
		System.out.println("Bigger size: " + y);
		System.out.println("Smaller sized: " + x);
		
		char charValue = '0';
		int unicode = (int) charValue;
		
		System.out.println("Char value " + charValue);
		System.out.println("Unicode " + unicode);

	}

}
