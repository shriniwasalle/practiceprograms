package GeneralPrograms;

public class ArmstrongNumber {

	// Armstrong number : 153 = (1*1*1)+(5*5*5)+(3*3*3)
	public static void main(String[] args) {
		
		int sum = 0;
		int a, temp;
		int num = 153;
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			sum = sum + (a * a * a);
		}
		if (temp == sum) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not armstrong number");
		}
	}
}
