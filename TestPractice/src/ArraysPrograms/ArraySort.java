package ArraysPrograms;

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 12, 15 };

		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Asceeding order");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ",");

		}
	}
}
