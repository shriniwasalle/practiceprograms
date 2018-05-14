package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("shri");
		list.add("dake");
		list.add("shri");
		list.add("mahesh");
		list.add("mahesh");
		
		Set<String> set = new HashSet<>();
		
		for(String str :list) {
			if(set.add(str) == false) {
				System.out.println(str);
			}
		}
			
	}

}
