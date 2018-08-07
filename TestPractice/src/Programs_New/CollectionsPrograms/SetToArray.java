package CollectionsPrograms;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Shri1");
		s.add("Shri2");
		s.add("Shri3");
		
		String [] str = new String[s.size()];
		
		int i = 0;
		for (String st : s) {
			str[i++]= st;
		}
		
		for (String str1 : str) {
			System.out.println(str1);
		}
		
		// Using toArray();
		String [] arr = s.toArray(new String[s.size()]);
		
		System.out.println("---- Using toArray() ----");
		for (String st : arr) {
			System.out.println(st);
		}
		
	}
}
