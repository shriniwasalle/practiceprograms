package GeneralPrograms;

public class TestReverseNumber {

	public static void main(String[] args) {
		int number = 12345;
		int rev = 0;
		int temp = number;
		while (number > 0) {
			rev = rev * 10;
			rev = rev + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse number is : " + rev);
	}
}
