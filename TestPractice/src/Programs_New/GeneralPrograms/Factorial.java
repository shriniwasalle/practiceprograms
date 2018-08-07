package GeneralPrograms;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		usingWhile(num, fact);
		usingForLoop();
	}

	private static void usingForLoop() {
		int number = 5;
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Using For Loop:" + fact);
	}
	
	private static void usingWhile(int num, int fact) {
		while (num > 0) {
			fact = fact * num;
			num--;
		}

		System.out.println("Using while : " + fact);
	}

}