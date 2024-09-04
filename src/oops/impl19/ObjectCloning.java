/**
 * This exmple is from the following resource:
 * https://www.digitalocean.com/community/tutorials/java-clone-object-cloning-java#object-cloning-types
 * */

package oops.impl19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 emp = new Employee2();
		emp.setId(1);
		emp.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp.setProps(props);
		
		Employee2 clonedEmpl = (Employee2) emp.clone();
		
		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and clonedEmpl == test: " + (clonedEmpl == emp));
		System.out.println("emp and clonedEmpl int type == test: " + (clonedEmpl.getId() == emp.getId()));
		System.out.println("emp and clonedEmpl String type == test: " + (clonedEmpl.getName() == emp.getName()));
		System.out.println("emp and clonedEmpl HashMap == test: " + (emp.getProps() == clonedEmpl.getProps()));
		
		// Let's see the effect of using default cloning
		
		// change emp props
		emp.getProps().put("title", "CEO");
		emp.getProps().put("city", "New York");
		System.out.println("emp props " + emp.getProps() + " and clonedEmp props: "  + " " +clonedEmpl.getProps());
		
		// change emp name
		emp.setName("new");
		emp.setId(5);
		System.out.println("clonedEmpl name:" + clonedEmpl.getName() + ", id: " + clonedEmpl.getId());
		
		/**
		 * Let’s look into the above output and understand what’s happening with Object clone() method.

			1. emp and clonedEmp == test: false: It means that emp and clonedEmp are two different objects, 
			   not referring to the same object. This is in agreement with the java object cloning requirement.
            
            2. emp and clonedEmp HashMap == test: true: So both emp and clonedEmp object variables refer to the 
               same object. This can be a serious data integrity issue if we change the underlying object value. 
               Any change in the value might get reflected to the cloned instance too.
			
			3. clonedEmp props:{city=New York, salary=10000, title=CEO}: We didn’t make any change in clonedEmp 
			   properties, but still, they got changed because both emp and clonedEmp variables are referring to 
			   the same object. This is happening because the default Object clone() method creates a shallow copy. 
			   It can be a problem when you want to create totally detached objects through cloning process. This 
			   can lead to unwanted results, hence the need to properly override the Object clone() method.
		    
		    4. clonedEmp name:Pankaj: What happened here? We changed the emp name but clonedEmp name didn’t change. 
		       It’s because String is immutable. So when we are setting emp name, a new string is created and emp 
		       name reference is changed in this.name = name;.Hence clonedEmp name remains unchanged. 
		       You will find similar behavior for any primitive variable types too. So we are good with java object 
		       default cloning as long as we have only primitive and immutable variables in the object.
		 * */
		
	}

}

class Employee2 implements Cloneable{
	
	private int id;
	private String name;
	private Map<String, String> props;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	
	 @Override
	 public Object clone() throws CloneNotSupportedException {
		 return super.clone(); // shallow cloning
	 }
	
	// Shallow cloning
  /** @Override
	  public Object clone() throws CloneNotSupportedException {
	
	 	// This is the default implementation of clone() method that uses shallow cloning. 
		
		 Employee2 emp = new Employee2(); // new employee object created with separate reference
		 emp.setId(this.getId());
		 emp.setName(this.name);
		 emp.setProps(this.props);
		 return emp;
	 }*/
	
		// Deep Cloning
	  /**  @Override
		public Object clone() throws CloneNotSupportedException {
	    	
	    	Object obj = super.clone(); //utilize clone Object method
			Employee2 clonedEmp = (Employee2) obj;
			clonedEmp.setProps(null);
			Map<String, String> hm = new HashMap<>();
			String key;
			Iterator<String> it = this.props.keySet().iterator();
			
			// Deep Copy of field by field
			while (it.hasNext()) {
				key = it.next();
				hm.put(key, this.props.get(key));
			}
			clonedEmp.setProps(hm);
			return clonedEmp;
		 }	
		*/
}
