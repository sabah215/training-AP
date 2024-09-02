package oops.impl11;

public class Test {
	
	Test(Object object) {
	      System.out.println("Hello");	 
	  }
	  Test(Test test) {
	      System.out.println("World");	  
	  }

	public static void main(String[] args) {
		 Test t = new Test(null);
	}

}
