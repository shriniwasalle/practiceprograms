package ArraysPrograms;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 11, 52, 52, 77, 3, 77 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println("Duplicate elements :" + arr[j]);
				}
			}
		}
	}
}
