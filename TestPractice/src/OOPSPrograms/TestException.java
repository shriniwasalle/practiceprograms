package OOPSPrograms;

public class TestException {

	void m() {
		throw new ArithmeticException("device error");// checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestException obj = new TestException();
		obj.p();
		System.out.println("normal flow");
	}

}
