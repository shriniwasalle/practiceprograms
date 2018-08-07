package CollectionsPrograms;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Shri 1");
		list1.add("Shri 2");
		list1.add("Shri 3");
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Shri 1");
		list2.add("Shri 5");
		
		list1.addAll(list2);
		//list1.removeAll(list2);
		System.out.println(" -- Use of addAll() function-- ");
		System.out.println(list1);
		
		System.out.println(" -- Use of addAll() function-- ");
		System.out.println(list1);
	}
}
