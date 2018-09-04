package OOPSPrograms;

class MyThread6 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Daemon functionality");
	}
}

public class TestMultithreading6 {
	public static void main(String[] args) {
		MyThread6 t1 = new MyThread6();
		t1.setDaemon(true);
	}
}
