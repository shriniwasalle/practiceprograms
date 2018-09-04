package CollectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(10, "Strings1");
		m.put(20, "Strings2");
		m.put(30, "Strings3");

		// Old Style
		Set<Map.Entry<Integer, String>> s = m.entrySet();
		Iterator<Map.Entry<Integer, String>> tr = s.iterator();

		while (tr.hasNext()) {
			Map.Entry<Integer, String> map = (Map.Entry<Integer, String>) tr.next();
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		
		// New Style
		for (Map.Entry<Integer, String> map : m.entrySet()) {
			if(map.getKey().equals(10))
				System.out.println(map.getValue());
			else 
				System.out.println("false");
		}

	}

}
