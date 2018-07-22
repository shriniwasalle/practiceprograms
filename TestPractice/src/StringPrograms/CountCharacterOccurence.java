package StringPrograms;

public class CountCharacterOccurence {
	
	public static void main(String[] args) {
		String str = "Java is java again java again".toLowerCase();
		System.out.println(str.length());
		System.out.println(str.replace("a", "").length());
		
		int len = str.length() - str.replace("a", "").length();
		System.out.println("Count of character 'a': " +len);
	}
}
