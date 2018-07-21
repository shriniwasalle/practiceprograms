package ArraysPrograms;

public class CopyToAnotherArray {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30 };
		int new_arr[] = new int[arr1.length];
			
		for (int i = 0; i < arr1.length; i++) {
			new_arr[i] = arr1[i];
		}
		
		System.out.println("New Array Elements :");
		for (int i = 0; i < new_arr.length; i++) {
			System.out.println(new_arr[i]);
		}
	}
}
