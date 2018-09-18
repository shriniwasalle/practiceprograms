package StringPrograms;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String st = "shriniwas 						alle";
		String str[] = st.split("\\s+");
		for (int i = 0; i < str.length; i++) {

			String str1 = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
			System.out.print(str1);
		}
	}
}
