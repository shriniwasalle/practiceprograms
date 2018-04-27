package ArraysPrograms;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 12, 15 };
		Arrays.sort(arr);
		/*for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.println(arr[i]);
		}*/
		
		for (int i = 0; i < arr.length; i++) {			
			System.out.println(arr[arr.length-2]);
			
		}
	}

}
