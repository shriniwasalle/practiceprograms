package GeneralPrograms;

public class TestStatic {

	private static int  i = 10;
	
	public static void sample() {
		System.out.println("In sample");
	}
	public static void main(String[] args) {
		TestStatic st = new TestStatic();
		TestStatic.sample();
		TestStatic.sample();
		System.out.println(TestStatic.i);
	}

}
