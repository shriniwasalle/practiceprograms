package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class UncommonValues {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("11");
		List<String> temp = new ArrayList<String>(list1);

		List<String> list2 = new ArrayList<String>();
		list2.add("11");
		list2.add("33");
		list2.add("3");
		list2.add("4");

		list1.removeAll(list2);
		list2.removeAll(temp);

		temp.clear();

		temp.addAll(list1);
		temp.addAll(list2);
		System.out.println("Output: " + temp);

	}
}
