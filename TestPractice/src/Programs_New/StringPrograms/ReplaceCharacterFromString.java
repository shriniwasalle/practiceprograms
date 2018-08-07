package StringPrograms;

public class ReplaceCharacterFromString {
	public static void main(String[] args) {
		String str = "shriniwas";
		String newStr = str.replace("s", "g");
		System.out.println(newStr);

		String str1 = "shriniwas alle";
		String[] newStr1 = str1.split("\\s");
		str1 = newStr1[0] + " " + newStr1[1].replace("a", "A");
		System.out.println(str1);

		// Only numbers = "\\D"
		String str3 = "hello123";
		str3 = str3.replaceAll("\\D", "");
		System.out.println(str3);

		// Only characters = "\\d"
		String str4 = "hello123";
		str4 = str4.replaceAll("\\d", "");
		System.out.println(str4);
	}
}
