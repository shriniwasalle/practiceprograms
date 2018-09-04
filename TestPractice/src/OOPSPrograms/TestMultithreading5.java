package OOPSPrograms;

class MyThread5 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hook functionality");
	}
}

public class TestMultithreading5 {
	public static void main(String[] args) throws InterruptedException {
		MyThread5 t1 = new MyThread5();
		
		Runtime.getRuntime().addShutdownHook(t1);
		
		for (int i = 0; i <= 6; i++) {
			Thread.sleep(2000);
			System.out.println("Main thread..");
			
			if(i==4) {
				System.exit(0);
			}
		}
	}
}
