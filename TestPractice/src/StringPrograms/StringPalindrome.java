package StringPrograms;

public class StringPalindrome {
	 
	public static void main(String[] args) {
		 String original="aba";
		 String reverse = ""; 
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- ) {  
	         reverse = reverse + original.charAt(i);
	      }
	      if (original.equals(reverse))  
	         System.out.println("String is a palindrome.");  
	      else  
	         System.out.println("String isn't a palindrome.");   
	   }  
}
