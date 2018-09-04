package OOPSPrograms;

public class TestGarbageCollection {
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}
	
	public static void main(String[] args) {
		
		TestGarbageCollection test1 = new TestGarbageCollection();
		TestGarbageCollection test2 = new TestGarbageCollection();
		
		// Way to garbage collect
		
		// Assigning the ref to another object
		test1 = test2;
		
		// Nulling the ref
		test1 = null;
		test2 = null;
		
		System.gc();
		
	}
}
