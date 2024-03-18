package ooPs;

public class MethodOveridingConcept2 extends MethodOveridingConcept {

	public static String demo123(String value) {
		 System.out.println(value);
		return value;
	}

	public static void main(String[] args) {

		String keyword = demo123("RUN");

		System.out.println(keyword);
	}

}
