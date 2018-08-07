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
