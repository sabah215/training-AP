package oops.impl17;

public class AbstractClass1 {

	public static void main(String[] args) {
		
		Circle c = new Circle("Circle", 5);
		System.out.println(c.getName() + " has area "  + c.calculateArea());
		
		
		Shape s = new Rectangle("Rectangle", 5,4);
		
		System.out.println(s.getName() + " has area " + s.calculateArea());
	}

}

abstract  class Shape{
	
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double calculateArea();
	
}

class Circle extends Shape {
	
	private static final double PI = 3.142;
	
	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}
	
}


class Rectangle extends Shape{
	
	private int length;
	private int width;
	
	public Rectangle(String name, int length, int width) {
		super(name);
		this.length = length;
		this.width =  width;
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}
	
}
