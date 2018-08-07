package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

class Employee1 {
	public int id;

	public Employee1(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee1))
			return false;
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}

public class TestEqualsAndHashCodeInMap {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1);
		Employee1 e2 = new Employee1(1);
		
		Map<Employee1, String> map1 = new HashMap<Employee1, String>();
		map1.put(e1, "shri1"); // Key = 1, value="shri1"
		map1.put(e2, "shri2"); // Key = 1, value="shri2"

		// This will print the size = 2 and allowing duplicates, bcz equals and hashcode is not overrided
		// If we want to get the size = 1, we need to override equals and hashcode
		System.out.println(map1.size());
		
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(i1, "shri1");
		map2.put(i2, "shri2");
		
		// This will print the size = 1, bcz Integer wrapper class has equals and hashcode methods overrided
		System.out.println(map2.size());
	}
}
