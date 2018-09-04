package GeneralPrograms;

public class TestException1 {

	public static void main(String[] args) {

		try {
			int i = 10;
			i = 10 / 0;
			System.out.println(i);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
