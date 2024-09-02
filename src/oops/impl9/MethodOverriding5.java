/** Implementation of method Hiding */
package oops.impl9;

class HealthcareOfficials {
	
	static String getSpecialization() {
		return "Provides healthcare service";
	}
}

class Clinician extends HealthcareOfficials{
	
	static String getSpecialization() {
		return "Clinical Practitioner";
	}
}

class Researcher extends HealthcareOfficials{
	
	static String getSpecialization() {
		return "Performs healthcare research";
	}
}

public class MethodOverriding5 {

	public static void main(String[] args) {
			
			System.out.println(Clinician.getSpecialization());
			System.out.println(Researcher.getSpecialization());
	}

}
