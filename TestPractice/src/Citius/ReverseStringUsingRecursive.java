package Citius;

public class ReverseStringUsingRecursive {

	public static void main(String[] args) {
		String str = "shriniwas";
		String reversedString = reverse(str);
		System.out.println(reversedString);
	}

	public static String reverse(String str) {

		if (str == null || str.length() == 0) {
			return "";
		} else {
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}

}
