package OOPSPrograms;

public class TestPrivateConstructor {
	private TestPrivateConstructor() {
		System.out.println("Hello1");
	}

	private TestPrivateConstructor(String str) {
		System.out.println("Hello2");
	}

	private TestPrivateConstructor(Object o) {
		System.out.println("Hello3");
	}

	public static void main(String[] args) {
		new TestPrivateConstructor(null);
	}
}
