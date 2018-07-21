package CollectionsPrograms;

import java.util.Arrays;

public class CustomeArrayList {

	private Object[] dataStore;
	private int size;

	public CustomeArrayList() {
		dataStore = new Object[10];
	}

	public boolean add(Object o) {

		if ((dataStore.length - size) <= 0) {
			increaseCapacity();
		}

		dataStore[size] = o;
		size++;
		return true;
	}

	private void increaseCapacity() {
		dataStore = Arrays.copyOf(dataStore, dataStore.length + 10);
	}

	@Override
	public String toString() {
		return dataStore[0].toString();
	}
	
	public static void main(String[] args) {
		CustomeArrayList list = new CustomeArrayList();
		list.add(10);
		
		
		System.out.println(list);
	}
}
