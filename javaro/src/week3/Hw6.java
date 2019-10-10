package week3;

public class Hw6 {

	public static void main(String[] args) {
		String strLove = "I Love java.";
		if (strLove.contains("java")) {
			System.out.println("Yes, java");
		} else {
			System.out.println("No, java");
		}
		System.out.println("---------------------------\n");

		int score = 90;
		if (score >= 90) {
			System.out.println("학점=A");
		} else if (score >= 80) {
			System.out.println("학점=B");
		} else if (score >= 70) {
			System.out.println("학점=C");
		} else {
			System.out.println("학점=F");
		}
		System.out.println("---------------------------\n");

		String gender = "Male";
		if (gender == "Male") {
			System.out.println("남자");
		} else {
			System.out.println("남자아님");
		}
		System.out.println("---------------------------\n");

		gender = "Male";
		if (gender.equalsIgnoreCase("male")) {
			System.out.println("남자");
		} else {
			System.out.println("남자아님");
		}
	}

}



















