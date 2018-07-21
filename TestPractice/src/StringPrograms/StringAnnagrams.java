package StringPrograms;

import java.util.Arrays;

public class StringAnnagrams {
	public static void main(String[] args) {
		String str1 = "ganesh";
		String str2 = "nagesh";
		
		if(str1.length() != str2.length()) {
			System.out.println("Strings are not Annagrams");
		}
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag = Arrays.equals(ch1, ch2);
		
		if(flag == true) {
			System.out.println("String are Annagrams");
		} else {
			System.out.println("String are not Annagrams");
		}
		
	}
			
}
