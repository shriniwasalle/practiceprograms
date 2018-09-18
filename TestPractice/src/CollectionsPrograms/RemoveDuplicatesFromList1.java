package CollectionsPrograms;

import java.util.ArrayList;

public class RemoveDuplicatesFromList1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("11");
		list.add("11");
		list.add("c");

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		System.out.println("After removing duplicates:" + list);
	}
}
