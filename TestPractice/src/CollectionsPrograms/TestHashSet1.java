package CollectionsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> h1 = new LinkedHashSet<String>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add("B");
		h1.add("A");
		h1.add("C");
		System.out.println(h1);

		h2.add(111);
		h2.add(530);
		h2.add(8843);

		System.out.println(h2);

	}
}
