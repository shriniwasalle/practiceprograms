package StringPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class TestImmutable1 {

	int id;
	String name;

	TestImmutable1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Id:" + id + "  Name:" + name;
	}

	public static void main(String[] args) {
		/*
		 * String str1 = "Shri"; String str2 = new String("Shri");
		 * 
		 * if(str1 == str2) System.out.println("true"); else
		 * System.out.println("false");
		 */

		TestImmutable1 t1 = new TestImmutable1(10, "Shri1");
		TestImmutable1 t2 = new TestImmutable1(20, "Shri2");
		TestImmutable1 t3 = new TestImmutable1(30, "Shri3");

		ArrayList<TestImmutable1> list = new ArrayList<TestImmutable1>();
		list.add(t1);
		list.add(t2);
		list.add(t3);

		Iterator<TestImmutable1> itr = list.iterator();
		while (itr.hasNext()) {
			TestImmutable1 it = itr.next();
			System.out.println(it.name);
		}
	}

}
