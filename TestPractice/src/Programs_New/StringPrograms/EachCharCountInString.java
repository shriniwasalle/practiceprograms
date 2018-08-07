package StringPrograms;

import java.util.HashMap;

public class EachCharCountInString {

	public static void main(String[] args) {
		String str = "Shriniwas Alle is my name".toLowerCase();

		// Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] chArr = str.toCharArray();

		// Checking each char of strArray
		for (char ch : chArr) {

			if (charCountMap.containsKey(ch)) {

				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(ch, charCountMap.get(ch) + 1);

			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(ch, 1);
			}
		}
		System.out.println(charCountMap);
	}
}
