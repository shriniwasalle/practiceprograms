package GeneralPrograms;

class Address {
	String city;
	String country;

	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}
}

public class EmployeeHasA {

	String no;
	String salary;

	public EmployeeHasA(String no, String salary, Address address) {
		System.out.println(no + "---" + salary + "---" + address.city + "---" + address.country);
	}

	public static void main(String[] args) {
		Address a1 = new Address("Pune", "US");
		EmployeeHasA e = new EmployeeHasA("123", "1000", a1);
	}

}
