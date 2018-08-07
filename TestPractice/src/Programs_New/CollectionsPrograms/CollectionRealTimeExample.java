package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

class Bike {
	
	String bikeName = "Yamaha FZ-S";

	public String toString() {
		return this.bikeName;
	}
	
}

class Factory {
	public ArrayList<Bike> order(int items) {

		ArrayList<Bike> bikes = new ArrayList<Bike>();
		for (int i = 0; i < items; i++) {
			Bike b = new Bike();
			bikes.add(b);
		}
		return bikes;
	}
}

public class CollectionRealTimeExample {

	
	public static void main(String[] args) {
		Factory f = new Factory();
		ArrayList<Bike> list1 = f.order(5);
		Iterator<Bike> itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
