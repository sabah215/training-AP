package stringhandling;

public class SwapTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "world";
		
		swap(s1,s2);

	}
	
	public static void swap(String a, String b) {
		
		a = a + b;
		
		b = a.substring(0, a.length() - b.length());
		
		a = a.substring(b.length());
		
		System.out.println(a + " " + b);
	}
}
