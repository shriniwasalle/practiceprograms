package Citius;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Automation tester";
		String [] words = str.split("\\s");
		
		for (int i = 0; i < words.length ; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length()-1; j >=0 ; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			System.out.print(reverseWord+ " ");
		}
	}

}
