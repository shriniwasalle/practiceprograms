package ArraysPrograms;

public class ArrayContainsValue {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(find(arr, 50));
	}

	private static boolean find(int[] arr, int value) {

		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
}