package StringPrograms;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer str1 = new StringBuffer("Java");
		
		for (int i = 0; i < 1000; i++) {
			str1.append("Tpoint");
		}

		System.out.println("Time by StringBuffer:  " +(System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("Java");
		
		for (int i = 0; i < 1000; i++) {
			str2.append("Tpoint");
		}
		
		System.out.println("Time by StringBuilder:  " +(System.currentTimeMillis() - startTime)+"ms");

	}

}
