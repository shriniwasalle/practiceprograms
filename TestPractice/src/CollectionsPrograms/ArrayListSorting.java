package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorting {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(5);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(3);
		a.add(1);
		a.add(9);
		a.add(7);
		
		System.out.println("Elements before sorting: ");
		System.out.println(a);
		int temp;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size() - i - 1; j++) {
				if (a.get(j) > a.get(j + 1)) {
					temp = a.get(j);
					a.set(j, a.get(j + 1));
					a.set(j, temp);
				}
			}
		}
		
		System.out.println(a);

	}
}
