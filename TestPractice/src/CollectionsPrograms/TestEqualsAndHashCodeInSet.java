package CollectionsPrograms;

import java.util.HashSet;
import java.util.Set;

class Student12 {
	public int id;

	public Student12(int id) {
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
		if (!(obj instanceof Student12))
			return false;
		Student12 other = (Student12) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}

public class TestEqualsAndHashCodeInSet {
	public static void main(String[] args) {
		Student12 st1 = new Student12(1);
		Student12 st2 = new Student12(1);

		Set<Student12> set = new HashSet<Student12>();
		set.add(st1);
		set.add(st2);

		// This will print the size = 2, because the equals and hashcode is not override.
		// If we override then we will get the size = 1
		System.out.println(set.size());
	}
}
