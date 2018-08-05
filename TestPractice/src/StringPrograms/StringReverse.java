package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Shriniwas".trim();

		// Using StringBulider
		StringBuilder str1 = new StringBuilder(str);
		System.out.println("Using StringBulider: "+str1.reverse());

		// Using StringBuffer
		StringBuffer str2 = new StringBuffer(str);
		System.out.println("Using StringBuffer: "+str2.reverse());

		// Using toCharArray method
		char[] strChar = str.toCharArray();
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(strChar[i]);
		}
		
		System.out.println();
		// Using charAt() function
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		// Using Collections
		char ch1[] = str.toCharArray();
		List<Character> list = new ArrayList<Character>();

		for (char ch : ch1) {
			list.add(ch);
		}
		System.out.println();
		Collections.reverse(list);
		ListIterator<Character> listIt = list.listIterator();
		System.out.println("-- Using ListIterator --");
		while (listIt.hasNext()) {
			System.out.print(listIt.next());
		}

	}
}
