package ooPs;

public class MethodOverLoadingConcept {

	public static void main(String[] args) {

		System.out.println(demo());
		System.out.println(demo("Parametized methd"));
		System.out.println(demo("Parametized methd2",12233456));

		System.out.println(demo1
				());
		
	}

	// Return type
	public static String demo() {
		String value = "ram";

		// Void is Default Return
		return value;

	}
	
	
	public static int demo1() {
		 int value = 123;

		// Void is Default Return
		return value;

	}

	
	// Return type
	public static String demo(String value) {
		
		
		System.out.println(value);

		// Void is Default Return
		return value;

	}
	
	 
	
	// Return type
		public static String demo(String value,int value2) {
			
			
			System.out.println(value+" "+value2);

			// Void is Default Return
			return value;

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
