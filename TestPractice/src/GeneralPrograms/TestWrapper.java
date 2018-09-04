package GeneralPrograms;

import java.util.HashSet;
import java.util.Set;

class Employee {

	int eID;
	String eName;

	public Employee(int eID, String eName) {
		this.eID = eID;
		this.eName = eName;
	}

	@Override
	public String toString() {
		return eID + eName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eID;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (eID != other.eID)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}

}

public class TestWrapper {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Shri1");
		Employee e2 = new Employee(12, "Shri2");
		Employee e3 = new Employee(12, "Shri2");

		Set<Employee> list = new HashSet<>();
		list.add(e1);
		list.add(e2);

		System.out.println(list.add(e3));

	}

}
