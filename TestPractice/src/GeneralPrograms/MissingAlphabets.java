package GeneralPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabets {

	public static void main(String[] args) {
		String strInput = "Shriniwas".replaceAll(" ", "");
		String strAlphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String [] input = strInput.split("");
		String [] alphabets = strAlphabets.split("");
		
		HashSet<String> s1 = new HashSet<>(Arrays.asList(input));
		HashSet<String> s2 = new HashSet<>(Arrays.asList(alphabets));
		
		//removeAll removes all the characters s1 characters from s2 
		s2.removeAll(s1);
		System.out.println("Missing alphabets from Input : "+s2);
	}

}
