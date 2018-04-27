package Citius;

public class ReverseStrings {
	public static void main(String[] args) {
		String str = new String("Hello, Shriniwas Alle");
		String[] strArr =  str.split("\\s");
		
		for (int i = strArr.length-1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		}	
	}
}
