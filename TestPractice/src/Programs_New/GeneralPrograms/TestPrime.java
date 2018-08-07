package GeneralPrograms;

import java.util.Scanner;

public class TestPrime {

	public static void main(String[] args) {
		primeNumber(5);
		primeOnetoAnyNumber();
	}

	private static void primeNumber(int n) {
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				temp++;
			}
		}
		if (temp == 2) {
			System.out.println(n + " is a Prime number");
		} else {
			System.out.println(n + " is Not a Prime number");
		}
	}

	private static void primeOnetoAnyNumber() {
		String primeNum = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			int counter = 0;

			for (int num = i; num >= 1; num--) {

				if (i % num == 0) {
					counter++;
				}
			}

			if (counter == 2) {
				primeNum = primeNum + i + " ";
			}
		}
		System.out.println("Prime Numbers between 1 to " + n + " are:");
		System.out.println(primeNum);
	}
}
