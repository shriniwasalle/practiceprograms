package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap1 {

	public int id;
	public String name;
	public int salary;

	public TestHashMap1(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		TestHashMap1 t1 = new TestHashMap1(11473, "Shriniwas1", 25000);
		TestHashMap1 t2 = new TestHashMap1(12473, "Shriniwas2", 26000);

		HashMap<Integer, TestHashMap1> h = new HashMap<Integer, TestHashMap1>();
		h.put(1, t1);
		h.put(2, t2);

		Set<Integer> keys = h.keySet();

		System.out.println("Key set values are: " + keys);
		for (Map.Entry<Integer, TestHashMap1> e : h.entrySet()) {
			int key = e.getKey();
			TestHashMap1 t = e.getValue();

			System.out.println("Key " + key + " Details: ");
			System.out.println("ID: " + t.id + " Name: " + t.name + " Salary: " + t.salary);
		}
	}
}
