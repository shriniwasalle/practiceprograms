package ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String arr[] = { "Shri1", "Shri2", "Shri3", "Shri4" };

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
	}
}
