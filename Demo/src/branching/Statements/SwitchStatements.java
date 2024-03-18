package branching.Statements;

public class SwitchStatements {

	public static void main(String[] args) {

		String value = "p";

		switch (value.toLowerCase()) {

		case "a":
			System.out.println("Entered Value Is Vowel-->" + value);
			break;
		case "e":
			System.out.println("Entered Value Is Vowel-->" + value);

			break;
		case "i":
			System.out.println("Entered Value Is Vowel-->" + value);

			break;
		case "o":
			System.out.println("Entered Value Is Vowel-->" + value);

			break;
		case "u":
			System.out.println("Entered Value Is Vowel-->" + value);

			break;
			default:
				
				System.out.println("Entered Value Is Consonent-->"+value);

				
				break;
				

		}

	}

}
