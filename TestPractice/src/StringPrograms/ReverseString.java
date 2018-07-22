package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String str = new String("Shriniwas Alle");

		System.out.println("Using chartAt :");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		char ch[] = str.toCharArray();

		System.out.println("\n" + "Using toChartArray :");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
