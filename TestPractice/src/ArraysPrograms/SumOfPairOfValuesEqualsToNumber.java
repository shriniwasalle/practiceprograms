package ArraysPrograms;

public class SumOfPairOfValuesEqualsToNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 10, 15, -5, 11, 5, 20 };
		int value = 20;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == value) {
					System.out.println(arr[i] + "+" + arr[j] + "= " + value);
				}
			}
		}

	}

}
