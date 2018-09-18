package GeneralPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecialCharactersPositionInString {

	public static void main(String[] args) {
		String input = "Shrini%Alle$123#";

		Pattern p = Pattern.compile("[!\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]");

		Matcher m = p.matcher(input);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.println(input.charAt(m.start()) + " at position " + (m.start() + 1));
		}
		System.out.println("Total special characters found: " + count);
	}
}
