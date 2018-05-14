package CollectionsPrograms;

import java.util.ArrayList;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("shri");
		list1.add("dake");
		list1.add("shri");
		list1.add("mahesh");
		list1.add("mahesh");

		ArrayList<String> list2 = new ArrayList<>();

		for (String str : list1) {
			if(list2.contains(str) == false) {
				list2.add(str);
			}
		}
		System.out.println(list2);
	}
}
