package java8.methodreference;

interface Circle{
	double getArea(int radius);
}

public class InstanceMethodReference1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceMethodReference1a ref = new InstanceMethodReference1a();
		Circle circle = ref::getArea;
		System.out.println(circle.getArea(4));

	}
	
	public double getArea(int r) {
		return (int) (Math.PI * r * r);
	}

}
