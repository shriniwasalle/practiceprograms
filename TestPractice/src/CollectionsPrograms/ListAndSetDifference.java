package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListAndSetDifference {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(new HashSet());
		list.add(20);
		list.add(10);
		list.add(30);
		System.out.println("List values: " + list);

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(50);
		set.add(10);
		set.add(30);
		set.add(60);
		set.add(55);
		set.add(65);
		System.out.println("Set values: " + set);
	}

}
