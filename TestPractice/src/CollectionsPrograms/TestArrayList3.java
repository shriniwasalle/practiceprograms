package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int age;
	String name;
	int rollNo;

	public Student(int age, String name, int rollNo) {
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
}

public class TestArrayList3 {

	public static void main(String[] args) {
		Student s1 = new Student(21, "Shriniwas1", 10);
		Student s2 = new Student(22, "Shriniwas2", 20);
		Student s3 = new Student(23, "Shriniwas3", 30);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		Iterator<Student> str = list.iterator();
		System.out.println(" -- Using while loop -- ");

		while (str.hasNext()) {
			Student st = str.next();
			System.out.println(" Age: " + st.age + " Name: " + st.name + " Roll No: " + st.rollNo);
		}

		System.out.println(" -- Using for loop -- ");
		for (Student st : list) {
			System.out.println(" Age: " + st.age + " Name: " + st.name + " Roll No: " + st.rollNo);
		}
	}
}
