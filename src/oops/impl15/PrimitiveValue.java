package oops.impl15;

public class PrimitiveValue {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println("Before swap " +a + " " +b);
		swap(a, b);
		System.out.println("After swap " +a + " " +b);
	}
	
	public static void swap(int x, int y) {
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("Inside swap method: " + x + " " + z);
	}
	
	

}
