package GeneralPrograms;

class A {

	// getter setter methods, can access the private data methods using these methods
	private int sal;

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}
}

public class TestStatic1 extends A {

	public static void main(String[] args) {
		int id = 90;
		TestStatic1 t = new TestStatic1();
		t.setSal(1000);
		System.out.println(t.getSal());
	}
}
