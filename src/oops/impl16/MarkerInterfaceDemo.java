package oops.impl16;

import oops.impl16.MarkerInterfaceDemo.Deletable;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {

	}
	
interface Deletable{	
}

}

class Entity implements Deletable{
	
}

class ShapeDao{
	
	public boolean delete(Object object) {
		
		if(!(object instanceof Deletable)) {
			return false;
		}
		
		return true;
	} 
}
