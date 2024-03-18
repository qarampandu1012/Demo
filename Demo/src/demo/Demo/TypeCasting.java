package demo.Demo;

public class TypeCasting {

	public static void main(String[] args) {
		// Type Casting

		/**/

		int value = 100;
		String word="121";
		double points=9.1;
		char charecter='R';
		
		
		//1 Implicit Type casting or Default Type casting
		//2 Explicit type casting
		
		
		double castedDoublevalue=(int)value;
		System.out.println(castedDoublevalue);
		
		int castedInigerValue=(int)castedDoublevalue;
		
		System.out.println(castedInigerValue);
		
		
		String castedStringvalue=String.valueOf(value);
		
		System.out.println(castedStringvalue);
		int values=Integer.parseInt(word);
		System.out.println(values);

	}

}
