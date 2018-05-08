package Citius;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 1, 20, 15 };
		usingArrays(arr);
		usingForLoops(arr);

	}

	private static void usingForLoops(int[] arr) {
		System.out.println("Array Length = " + arr.length);
		System.out.println("Before Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println("After Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	// Using Arrays class
	private static void usingArrays(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
