package demo.Demo;

public class DataTypes {

	public static void main(String[] args) {

		char value='B';
		System.out.println(value);
		
		boolean result=false;
		
		System.out.println(result);
		
		
		int value1=100;
		System.out.println(value1);
		
		long value2=1000000000;
		System.out.println(value2);
		
		

		double value3=1000000000.0;
		System.out.println(value3);
		
		String word ="India Is Great";
		
		System.out.println(word);
		String Breakfast="Veena Have Breakfast";
		
		System.out.println(Breakfast);
		System.out.println(Breakfast.toLowerCase());
		System.out.println(Breakfast.toUpperCase());
		
		if(Breakfast.toUpperCase().equals("VEENA HAVE BREAKFAS"))
		{
			System.out.println("Veena Done her Breakfast");
		}else {
			System.out.println("Veena Not Done hert  Breakfast");
		}

		if(Breakfast.isBlank())
		{
			System.out.println("String is BLank");
		}else {
			System.out.println("String is not BLank");
		}
		
		
	}

}
