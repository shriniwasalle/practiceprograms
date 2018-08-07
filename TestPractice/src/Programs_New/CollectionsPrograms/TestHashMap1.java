package CollectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap1 {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "Shri1");
		m.put(2, "Shri2");
		m.put(3, "Shri3");
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		
		System.out.println(" -- Old style -- ");
		while (itr.hasNext()) {
			Map.Entry e = (Map.Entry)itr.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}
}
