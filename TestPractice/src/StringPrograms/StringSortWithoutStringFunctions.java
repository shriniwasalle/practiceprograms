package StringPrograms;

public class StringSortWithoutStringFunctions {

	public static void main(String[] args) {

		String str = "edcba";
		char[] ch = str.toCharArray();
		char temp = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				
				if (ch[j] > ch[i]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		for (int k = 0; k < ch.length; k++) {
			System.out.print(ch[k]);
		}
	}
}
