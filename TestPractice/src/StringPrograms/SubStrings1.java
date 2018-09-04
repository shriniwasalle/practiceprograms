package StringPrograms;

public class SubStrings1 {

	public static void main(String[] args) {
		String str = "Welcome to geeksforgeeks";
		String substr = "";
		
		// prints the substring after index 7 till index 17
		substr = str.substring(10, 16);
		System.out.println("substring = " + substr);
		
	}
}
