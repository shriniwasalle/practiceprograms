package GeneralPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharactersString {
	// Input : good looking, Output : godlkin
	public static void main(String[] args) {
		String str = "good looking";
		Set<Character> st = new LinkedHashSet<Character>();

		char[] ch = str.toCharArray();

		for (char c : ch) {
			st.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (char c : st) {
			sb.append(c);
		}
		System.out.println(sb.toString().replaceAll("\\s", ""));
	}

}
