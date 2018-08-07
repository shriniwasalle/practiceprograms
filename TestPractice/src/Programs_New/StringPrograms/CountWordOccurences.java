package StringPrograms;

public class CountWordOccurences {

	public static void main(String[] args) {
		String str = "xy cbz xyz abc";
		String word = "xy";

		String[] splitStr = str.split(" ");
		int count = 0;
		for (int i = 0; i < splitStr.length; i++) {
			if (word.equals(splitStr[i])) {
				count++;
			} else
				System.out.print("");
		}
		System.out.println("The word " + word + " found " + count + " times");
	}
}
