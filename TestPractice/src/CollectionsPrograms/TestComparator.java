package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students {

	int age;
	String name;

	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class AgeComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {

		if (o1.age == o2.age)
			return 0;
		else if (o1.age > o2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(new Students(10, "Shri1"));
		list.add(new Students(5, "Shri2"));

		System.out.println("** Sort using Age Comparator **");
		Collections.sort(list, new AgeComparator());

		Iterator<Students> itrAge = list.iterator();

		while (itrAge.hasNext()) {
			Students st = itrAge.next();
			System.out.println(st.age + " -- " + st.name);
		}

		System.out.println("\n** Sort using Name Comparator **");
		Collections.sort(list, new NameComparator());

		Iterator<Students> itrName = list.iterator();

		while (itrName.hasNext()) {
			Students st = itrName.next();
			System.out.println(st.age + " -- " + st.name);
		}
	}
}
