package GeneralPrograms;

class Test1 {
	void Sample() {
		System.out.println("Method of Test1 class");
	}
}

public class TypeCastingOfClass extends Test1 {
	
	void Sample() {
		super.Sample();
		System.out.println("Method of TypeCastingOfClass class");
	}
	
	public static void main(String[] args) {
		// Upcasting
		Test1 test1 = (Test1)new TypeCastingOfClass();
		test1.Sample();
		
		
		// Downcasting		
		TypeCastingOfClass test2 = (TypeCastingOfClass) test1;
		test2.Sample();
	}

}
