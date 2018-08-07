package CollectionsPrograms;

import java.util.ArrayList;

public class TestGenericNonGeneric {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Shrini");
		
		// Without Generic
		String str = (String)list.get(0);
		System.out.println(str);
		
		ArrayList<String> genericList = new ArrayList<String>();
		genericList.add("Shriniwas");
		System.out.println(genericList.get(0));
	}

}
