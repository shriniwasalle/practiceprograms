package StringPrograms;

public class CountCharacterOccurence {
	
	public static void main(String[] args) {
		String str = "Java is java again java again".toLowerCase();
		System.out.println(str.length());
		System.out.println(str.replace("a", "").length());
		
		int len = str.length() - str.replace("a", "").length();
		System.out.println("Count of character 'a': " +len);
		
		String str1 = "shriniwas";
		int count =  str1.length() - str1.replace("i", "").length();
		System.out.println("Count of char 'i': "+count);
		
	}
}
