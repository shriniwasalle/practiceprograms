package GeneralPrograms;

public class TestReverseNumber {

	public static void main(String[] args) {
		int number = 121;
		int rev = 0;
		int temp = number;
		while (number > 0) {
			rev = rev * 10;
			rev = rev + number % 10;
			number = number / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " number is a palindrome");
		} else
			System.out.println(temp + " number is not a palindrome");

		System.out.println("Reverse number is : " + rev);
	}
}
