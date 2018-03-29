package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	int empId;
	String empName;
	
	public Employee(int empID, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public String toString() {
		return empName;
	}
}

class Student11 {
	int studId;
	String studName;
	
	public Student11(int studId, String studName) {
		this.studId = studId;
		this.studName = studName;
		
			
		 
	}
	
	public String toString() {
		return studId+"";
	}
}

public class TestCollection {

	
	public static void main(String[] args) {
		
		Employee al = new Employee(123, "Alle");
		Student11 st = new Student11(11,"Shriniwas");
		Integer i = new Integer(10);
		ArrayList<Object> alist = new ArrayList<Object>();
		alist.add(al);
		alist.add(st);
		alist.add(i);
		alist.add(new String("Alle"));
	
		Iterator itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
