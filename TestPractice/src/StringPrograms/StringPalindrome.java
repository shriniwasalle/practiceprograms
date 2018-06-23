package StringPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1 = "MADAM";
		String rev = "";
		for (int i = str1.length()-1; i >=0 ; i--) {
			rev = rev + str1.charAt(i);
		}
		
		if(str1.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("Not string is palindrome");
		}
		
		// Using StringBuffer
		String str2 = "madam";
		StringBuffer strB = new StringBuffer(str2);
		String strB1 = strB.reverse().toString();
		if(strB1.equals(str2)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("Not string is palindrome");
		}
 		
	}

}
