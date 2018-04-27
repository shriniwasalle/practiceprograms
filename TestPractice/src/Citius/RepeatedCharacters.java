package Citius;

import java.util.HashMap;

public class RepeatedCharacters {

	public static void main(String[] args) {
		String str = "MynameisShriniwas".toLowerCase();
		char[] chArr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : chArr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		System.out.println(map);

	}

}
