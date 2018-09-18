package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromListUsingSet {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Kuldip");
		list1.add("Abhi");
		list1.add("Shri");
		list1.add("Shri");
		list1.add("Abhi");
		list1.add("Kuldip");

		Set<String> set = new HashSet<String>(list1);
		System.out.println(set);
	}

}
