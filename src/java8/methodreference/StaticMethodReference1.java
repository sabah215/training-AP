package java8.methodreference;

@FunctionalInterface
interface MySquareFunction{
	int square(int n);
}

public class StaticMethodReference1 {

	public static void main(String[] args) {
		
		MySquareFunction func = StaticMethodReference1::calculateSquare;
		
		int squared = func.square(5);
		System.out.println(squared);
		
	}
	
	public static int calculateSquare(int n) {
		return n * n;
	}

}
