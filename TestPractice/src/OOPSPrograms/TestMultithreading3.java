package OOPSPrograms;

class MyThread2 extends Thread {

	public void run() {
		
	}
}

public class TestMultithreading3 {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
			
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("Shriniwas");
		System.out.println(t1.getName());
		t2.setName("Alle");
		System.out.println(t2.getName());
		
		System.out.println(Thread.currentThread().getName());
	}
}
