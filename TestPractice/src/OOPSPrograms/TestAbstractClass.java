package OOPSPrograms;

abstract class AB {
	int i = 10;

	AB() {
		System.out.println("In Abstract class");
	}
}

public class TestAbstractClass extends AB {
	int j = 20;

	public void test() {
		System.out.println("In default");
		System.out.println(this.j);
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		TestAbstractClass test = new TestAbstractClass();
		test.test();

	}

}
