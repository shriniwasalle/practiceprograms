package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(140);
		list.add(11);
		list.add(5);
		Collections.reverse(list);
		System.out.println("Reverse List:"+list);
		int min = Collections.min(list);
		System.out.println("Minimum value:"+min);
		int max = Collections.max(list);
		System.out.println("Maximum value:"+max);
	}
}
