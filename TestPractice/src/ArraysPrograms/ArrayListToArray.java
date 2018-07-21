package ArraysPrograms;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shri1");
		list.add("Shri2");
		list.add("Shri3");
		list.add("Shri4");
		
		String arr [] = list.toArray(new String[list.size()]);
		
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
