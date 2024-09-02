package oops.impl1;

public class MathUtils {
	
	public static class Constants{
		// not visible
		public int x = 10;
		static int y = 5;
		public static final double PI = 3.14159;
		
		public static double calculateArea(double radius) {
			return PI * radius * radius;
		}
		
		// not visible
		public  double calculateCircum(double radius) {
			return PI * 2 * radius;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathUtils utils = new MathUtils();
		
		System.out.println(MathUtils.Constants.calculateArea(10));
		MathUtils.Constants.y = 9;
		
	
		

	}

}
