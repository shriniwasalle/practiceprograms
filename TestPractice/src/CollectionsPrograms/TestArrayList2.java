package CollectionsPrograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shri 1");
		list.add("Shri 2");
		list.add("Shri 3");
		list.add("Shri 4");
		
		
		Iterator<String> it = list.iterator();
		System.out.println("-- Iterate using while loop -- ");
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("-- Iterate using foreach loop -- ");
		for(String str : list) {
			System.out.println(str);
		}
	}
}
