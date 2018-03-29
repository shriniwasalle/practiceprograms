package GeneralPrograms;

import org.jboss.netty.util.internal.SystemPropertyUtil;

public class TestRecursive {

	public static void main(String[] args) {
		TestRecursive t = new TestRecursive();
		System.out.println("Using Recursion :"+t.recursiveTest("Shriniwas"));
		System.out.println("Using Iterative :"+t.iterativeTest("Shriniwas"));
	}
	
	// Using Recursive
	public String recursiveTest(String input) {
		
		if(null == input || input.length() == 0 )
			return "";
		else 
			return recursiveTest(input.substring(1))+input.charAt(0);
	}
	
	// Using Iterative
	public String iterativeTest(String str) {
		
		if (null == str || str.length() == 0)
			return "";

		int length = str.length();
		char[] ch = str.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			
			char firstHalf = ch[i];
			char secondHalf = ch[length - i - 1];

			// Swapping : Assigning the char at reverse position
			ch[i] = secondHalf;
			ch[length - i - 1] = firstHalf;
		}
		return new String(ch);
	}

}
