package CollectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestTreeSet {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(10, "Strings1");

		// Method 1
		Set<Map.Entry<Integer, String>> s = m.entrySet();
		Iterator<Map.Entry<Integer, String>> tr = s.iterator();

		while (tr.hasNext()) {
			Map.Entry<Integer, String> map = (Map.Entry<Integer, String>) tr.next();
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		
		// Method 2
		for (Map.Entry<Integer, String> map : m.entrySet()) {
			if(map.getKey().equals(11))
				System.out.println(map.getValue());
			else 
				System.out.println("false");
		}

	}

}
