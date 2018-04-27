package Citius;

public class ReverseStringUsingIterative {

	public static void main(String[] args) {
		String str = "Yogesh";
		String strOutput = usingIterative(str);
		System.out.println(strOutput);
	}

	public static String usingIterative(String str) {

		if (str == null || str.length() == 0) {
			return "";
		}

		int length = str.length();
		char[] ch = str.toCharArray();

		for (int i = 0; i < length / 2; i++) {

			char firstHalf = ch[i];
			char secondHalf = ch[length - i - 1];

			ch[i] = secondHalf;
			ch[length - i - 1] = firstHalf;
		}
		return new String(ch);
	}
}
