package java8.methodreference;

interface MyStringConcatenator{
	
	String concatenate(String s1, String s2);
} 

public class InstanceMethodReference1 {
	public static void main(String [] args) {
		
		InstanceMethodReference1 methodReference = new InstanceMethodReference1();
		MyStringConcatenator concatenator = methodReference::customConcatenate;
		
		String result = concatenator.concatenate("Hello, ", "World!");
		System.out.println("Concatenated String " + result);
	}
	
	public String customConcatenate(String s1, String s2) {
		return s1 + s2;
	}
}
