package oops.impl6;

public class MethodOverloadingTypePromotionDemo {
	
//	public void display(byte num) {
//        System.out.println("One parameter byte type: " + num);
//    }
	
	public void display(int num) {
        System.out.println("One parameter int type: " + num);
    }
	
	public void display(long num) {
        System.out.println("One parameter long type: " + num);
    }
	
//	public void display(float num) {
//        System.out.println("One parameter float type: " + num);
//    }
	
	public void display(double num) {
        System.out.println("One parameter double type: " + num);
    }

	public static void main(String[] args) {
		
	 MethodOverloadingTypePromotionDemo example = new MethodOverloadingTypePromotionDemo();
	 
	 byte x = 15;
	 float y = 1.5f;
     example.display(x);
     example.display(y);
    // example.display(10.5);
		

	}

}
