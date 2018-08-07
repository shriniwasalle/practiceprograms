package GeneralPrograms;

class Student {
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void test() {
		System.out.println("Test");
	}

	public static void test1() {
		
	}
}

public class TestStudent {

	public static void main(String[] args) {
			Student [] st = new Student[2];
			st[0] = new Student("Shubham1", 10);
			st[1] = new Student("Shubham2", 20);
			Student.test1();		
	}

}
