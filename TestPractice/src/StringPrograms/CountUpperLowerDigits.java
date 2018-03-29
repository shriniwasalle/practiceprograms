package StringPrograms;

public class CountUpperLowerDigits {

	static public void main(String[] args) {

		String str = "My name is Shriniwas & my email id is shriniwas123@gmail.com";

		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int other = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCase++;
			} else if (Character.isLowerCase(ch)) {
				lowerCase++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				other++;
			}
		}

		System.out.println("Upper case letters: " + upperCase);
		System.out.println("Lower case letters: " + lowerCase);
		System.out.println("Digits : " + digits);
		System.out.println("Other letters: " + other);

	}
}
