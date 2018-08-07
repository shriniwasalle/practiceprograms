package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


class Student1 {
	int roll;
	String name;
	
	public Student1(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
}

public class TestComparable {
	
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		List<Integer> listInteger = new ArrayList<Integer>(); 
		listString.add("Shriniwas");
		listString.add("Alle");
		listString.add("Nagesh");
		
		listInteger.add(Integer.valueOf(10));
		listInteger.add(Integer.valueOf(22));
		listInteger.add(Integer.valueOf(5));
		listInteger.add(15);
		
		Collections.sort(listString);
		Collections.sort(listInteger);
		
		Iterator<String> itr = listString.iterator();
		Iterator<Integer> itrInt = listInteger.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		
		while(itrInt.hasNext()) {
			System.out.println(itrInt.next());	
		}
	
		
	}
}
