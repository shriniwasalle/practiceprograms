package StringPrograms;

public class String2 {
	public static void main(String[] args) {
		String st1 = "Shri";
		String st2 = new String("Shri");
	
		// This will return false, bcz st1 is stored in scp and st2 is stored in heap, even though content is same
		System.out.println(st1 == st2);
		
		st2 = st2.intern();
		// This will return true
		System.out.println(st1 == st2);
		
		// It will return true, bcz content is same
		System.out.println(st1.equals(st2));
	}
}	
