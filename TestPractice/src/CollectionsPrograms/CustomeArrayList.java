package CollectionsPrograms;

import java.util.Arrays;

public class CustomeArrayList {

	private Object[] dataStore;
	private int size = 0;

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

	public Object get(int index) {

		if (index > size) {
			throw new IndexOutOfBoundsException();
		}
		return dataStore[index];
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		CustomeArrayList list = new CustomeArrayList();
		list.add(10);
		list.add(20);
		System.out.println("Element: " + list.get(0));
		System.out.println("Size of list: " + list.size());
	}
}
