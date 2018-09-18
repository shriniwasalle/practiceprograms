package GeneralPrograms;

class TestStatic3 {

	public static void t1() {
		System.out.println("In Parent");
	}
}

public class TestStatic2 extends TestStatic3 {
	
	static {
		TestStatic2 t = new TestStatic2();
		System.out.println("Before : " + t);
	}
	
	public static void t1() {
		System.out.println("In Child");
	}

	public static void main(String[] args) {
		TestStatic3 t1 = new TestStatic2();
		t1.t1();
	}

}
