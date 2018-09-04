package CollectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashmapWorking {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("c", 4);
		map.put("null", 5);
		System.out.println(map);
		
		Set<Map.Entry<String, Integer>> s = map.entrySet();
		// Old style
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> m = (Map.Entry<String, Integer>) itr.next();
			System.out.println(m.getKey() + "  " + m.getValue());
		}

		// New Style
		for (Map.Entry<String, Integer> m1 : map.entrySet()) {
			m1.getKey();
			m1.getValue();
		}

	}

}
