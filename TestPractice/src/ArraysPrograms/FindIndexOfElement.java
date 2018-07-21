package ArraysPrograms;

public class FindIndexOfElement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int value = 20;
		int i = 0;

		while (i <= arr.length) {

			if (arr[i] == value) {
				System.out.println("Element "+ value +" is at position : "+ i);
				break;
			} else {
				i++;
			}

		}
	}
}
