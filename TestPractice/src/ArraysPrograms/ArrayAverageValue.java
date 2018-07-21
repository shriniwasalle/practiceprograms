package ArraysPrograms;

public class ArrayAverageValue {

	public static void main(String[] args) {
		int arr[] = {3,4,5,7,9};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum :" +sum);
		System.out.println("Average :" +sum/arr.length);
	}

}
