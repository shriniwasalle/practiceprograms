package OOPSPrograms;
import java.io.IOException;

class Parent {
	public void test() throws IOException {
		System.out.println("Parent Method");
	}
}

public class TestExceptionOverriding extends Parent {
	
	public void test() throws ArrayIndexOutOfBoundsException {
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) throws Exception {
		TestExceptionOverriding test = new TestExceptionOverriding();
		test.test();
	}
}
