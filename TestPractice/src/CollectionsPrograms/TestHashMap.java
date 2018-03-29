package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public int id;
	public String name;
	public int salary;

	public TestHashMap(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		TestHashMap t1 = new TestHashMap(11473, "Shriniwas1", 25000);
		TestHashMap t2 = new TestHashMap(12473, "Shriniwas2", 26000);

		HashMap<Integer, TestHashMap> h = new HashMap<Integer, TestHashMap>();
		h.put(1, t1);
		h.put(2, t2);

		Set<Integer> keys = h.keySet();

		System.out.println("Key set values are: " + keys);
		for (Map.Entry<Integer, TestHashMap> e : h.entrySet()) {
			int key = e.getKey();
			TestHashMap t = e.getValue();

			System.out.println("Key " + key + " Details: ");
			System.out.println("ID: " + t.id + " Name: " + t.name + " Salary: " + t.salary);
		}
	}
}
