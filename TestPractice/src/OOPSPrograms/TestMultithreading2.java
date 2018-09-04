package OOPSPrograms;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello, Shri!");
	}
}

public class TestMultithreading2 {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread1 t2 = new MyThread1();
		t2.start();
		MyThread1 t3 = new MyThread1();
		t3.start();
	}

}
