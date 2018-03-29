package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student2>{
	int roll;
	String name;

	public Student2(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	/*public int compareTo(Student2 st) {
		if (this.roll == st.roll)
			return 0;
		else if (this.roll > st.roll)
			return 1;
		else
			return -1;
	}*/
	
	public int compareTo(Student2 st) {
		return this.name.compareTo(st.name);
	}
}

public class TestComparable1 {

	public static void main(String[] args) {
		ArrayList<Student2> all = new ArrayList<Student2>();
		all.add(new Student2(10, "Shri1"));
		all.add(new Student2(5, "Shri2"));
		all.add(new Student2(15, "Shri3"));
		
		Collections.sort(all);
		for(Student2 st : all) {
			System.out.println(st.roll + "---" +st.name );
		}
	}
}
