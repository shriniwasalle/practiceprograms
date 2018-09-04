package GeneralPrograms;

interface Demo {
	public void get();
}

abstract class test {
	public abstract void get();
}

public class TestException  {
	
	public static void main(String[] args) {
		try {
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
		} finally {
			try {
				int i = 1/0;
				System.out.println(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
	}

}
