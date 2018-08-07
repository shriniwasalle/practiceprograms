package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap2 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(111, "ABC");
		m.put(222, "PQR");
		m.put(333, "XYZ");
		
		System.out.println(" -- New Style -- ");
		for (Map.Entry<Integer, String> me : m.entrySet()) {
			System.out.println(me.getKey() + "  " + me.getValue());
		}
	}

}
