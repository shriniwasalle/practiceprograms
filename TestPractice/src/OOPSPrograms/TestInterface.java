package OOPSPrograms;

public class TestInterface implements Cloneable {
	int rollNo;
	String name;

	public TestInterface(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws Exception {
		TestInterface t1 = new TestInterface(10, "Shriniwas");
		TestInterface t2 = (TestInterface) t1.clone();

		System.out.println("Roll No:" + t1.rollNo + " " + "Name:" + t1.name);
		System.out.println("Roll No:" + t2.rollNo + " " + "Name:" + t2.name);

	}

}
