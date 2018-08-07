package ArraysPrograms;

public class SwapTwoArrays {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 50, 70, 80, 90, 100 };
		int temp[] = new int[arr1.length];

		System.out.println("Array1 : Before Swapping:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\n"+"Array2 : Before Swapping:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();System.out.println();
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp[i];
		}

		System.out.println("Array1 : After Swapping:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\n"+"Array2 : After Swapping:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
