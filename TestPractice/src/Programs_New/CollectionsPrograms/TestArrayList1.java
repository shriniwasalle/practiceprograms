package CollectionsPrograms;

public class TestArrayList1 {

	public static void main(String[] args) {
		Integer[] intArray = {10,20,30};
		Character[] charArray = {'A','B','C','D'};
		System.out.println("Integer Array:");
		printArray(intArray);
		System.out.println("Character Array:");
		printArray(charArray);	
	}
	
	private static <E> void printArray(E[] elements) {
		for(E element :elements) {
			System.out.println(element);
		}
		System.out.println();
	}

}
