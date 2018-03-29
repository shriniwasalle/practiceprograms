package StringPrograms;

import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
		
		String str = new String("My is Shriniwas Alle");
		
		String[] strA = str.split(" ");
		
		for (int i = strA.length-1; i >= 0; i--) {
			
			System.out.println(strA[i]);
		}
		
		System.out.println("");
		
		// Using StringTokenizer
		StringTokenizer strT = new StringTokenizer("Shriniwas,Alle", ",");
		System.out.println("-- Using StringTokenizer --");
		while(strT.hasMoreTokens()) {
			System.out.println(strT.nextToken());
		}
		
		
	}

}
