package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

public class TestMap1 {
	public static void main(String[] args) {
		Map m = new HashMap<>();
		m.put(101, "Shri1");
		m.put(102, "Shri2");
		m.put(101, "Shri3");
		System.out.println(m);
	}
}
