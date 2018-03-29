package CollectionsPrograms;

import java.util.HashSet;

class Student3 {

	public String name;

	public Student3(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class TestHashSet2 {
	public static void main(String[] args) {
		Student3 s1 = new Student3("Alle1");
		Student3 s2 = new Student3("Alle2");

		HashSet<Student3> h = new HashSet<Student3>();
		h.add(s1);
		h.add(s2);

		System.out.println(h.add(new Student3("Alle1")));
		
	}
}
