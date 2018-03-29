package GeneralPrograms;

final class ClassImmutable {

	private final int id;
	private final String name;

	public ClassImmutable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public class TestImmutable {

	public static void main(String[] args) {
		ClassImmutable c = new ClassImmutable(1143, "Shriniwas");
		System.out.println(c.getId());
		System.out.println(c.getName());
	}
}
