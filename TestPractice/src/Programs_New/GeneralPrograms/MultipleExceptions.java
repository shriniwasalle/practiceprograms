package GeneralPrograms;

public class MultipleExceptions {
	public static void main(String[] args) {
		try {
			int arr[] = new int[10];
			arr[11] = 3/0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
