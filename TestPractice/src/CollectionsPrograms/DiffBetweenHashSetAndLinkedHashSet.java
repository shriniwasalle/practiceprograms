package CollectionsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DiffBetweenHashSetAndLinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
		
		h1.add("B");
		h1.add("A");
		h1.add("C");
		System.out.println("HashSet: "+h1);

		h2.add(111);
		h2.add(530);
		h2.add(8843);

		System.out.println("Linked HashSet: "+h2);
		
	}
}
