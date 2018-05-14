package CollectionsPrograms;
import java.util.LinkedList;

public class TestLinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add(0,"Shri1");
		list.add(1,"Shri3");
		list.add(2,"Shri2");
		list.addFirst("ShriFirst");
		list.addLast("ShriLast");
		System.out.println(list);
		
	}

}
