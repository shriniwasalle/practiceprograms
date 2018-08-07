package GeneralPrograms;

public class ExtractNumberAfterDot {

	public static void main(String[] args) {
		
		double d = 1011.1511;
		String number = String.valueOf(d);
		System.out.println(number.substring(number.indexOf(".")+1));
	}
}
