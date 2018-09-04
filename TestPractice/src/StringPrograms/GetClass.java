package StringPrograms;

public class GetClass {
	
	public static void main(String[] args) {
		String str = "Shri";
		
		// This will print class java.lang.String
		System.out.println(str.getClass());
		
		// This will print "java.lang.String"
		System.out.println(str.getClass().getName());
	}
}
