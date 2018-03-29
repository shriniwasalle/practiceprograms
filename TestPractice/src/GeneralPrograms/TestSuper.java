package GeneralPrograms;

class SuperClass {
	public String s;
	public SuperClass() {
		System.out.println("In super default constructor");
	}
}

public class TestSuper extends SuperClass {
	int i;
	public TestSuper() {
		System.out.println("In default constructor");
	}
	
	public TestSuper(int i) {
		
		System.out.println("In param constructor");
	}
	
	public void test() {
		this.i = 10;
		super.s = "Shri";		
	}
	public static void main(String[] args) {
	
		TestSuper t1 = new TestSuper(10);
	}
}
