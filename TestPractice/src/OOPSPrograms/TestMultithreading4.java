package OOPSPrograms;

class MyThread4 extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			//System.out.println("User thread");
		}
	}
}

public class TestMultithreading4 {
	
	public static void main(String[] args) {
		MyThread4 t1 = new MyThread4();
		t1.start();
		t1.setPriority(3); // set priority
		
		MyThread4 t2 = new MyThread4();
		t2.start();
		
		t2.setPriority(2);
		System.out.println(t2.getPriority()); // get priority
	}
}
