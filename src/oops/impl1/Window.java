package oops.impl1;

import oops.impl1.Window.Button;

public class Window {
	
	private static int width;
	private static int height;
	
	public Window(int width, int height) {
		this.width = width;
		this.height = height;
		}

	public static class Button{
		
		int x = 6;
		
		public void click() {
			System.out.println("Button clicked in a window of size "+ width + "x" + height);
		}
	}
	
	public static void main(String[] args) {
		Window w = new Window(5,4);
	
		
		
	}

}


