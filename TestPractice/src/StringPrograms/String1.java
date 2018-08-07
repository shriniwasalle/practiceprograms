package StringPrograms;

class Stud {

	public Stud(String string) {
		System.out.println("");
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

public class String1 {

	public static void main(String[] args) {
		String s1 = new String("Shri123");
		String s2 = new String("Shri123");

		Stud st1 = new Stud("Shri1");
		Stud st2 = new Stud("Shri1");

		// It will do the reference comparison
		System.out.println(s1 == s2);
		
		// String class has equals method that's why does the content comparison
		System.out.println(s1.equals(s2));

		// It will do the reference comparison
		System.out.println(st1 == st2);
		
		/* Here, we need to override equals method otherwise it will go to Objects class equals method and do the
		reference comparison */
		System.out.println(st1.equals(st2));
	}
}
