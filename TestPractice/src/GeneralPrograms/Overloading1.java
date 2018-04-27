package GeneralPrograms;

public class Overloading1 {

	public void test(int i) {
		System.out.println(i);
		
	}
	private void test(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Overloading1 ov = new Overloading1();
		ov.test(10);
		ov.test("Shri");
	}
}
