package OOPSPrograms;
class TestConstructor2 
{
	public TestConstructor2() {
		System.out.println("Hello 1");
	}
}

public class TestConstructor1 extends TestConstructor2 {
	
	public TestConstructor1(String s) {
		// Compiler will add super() by default
		System.out.println("Hello 2");
	}
	
	public static void main(String[] args) {
		new TestConstructor1("Shriniwas");
	}

}
