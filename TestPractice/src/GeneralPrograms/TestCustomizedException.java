package GeneralPrograms;


class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String s) {
		super(s);
	}
	
}
public class TestCustomizedException {
	
	static void validate(int age) throws InvalidAgeException {
		
		if(age < 18) {
			throw new InvalidAgeException("Age is not valid");
		} else 
			System.out.println("welcome to vote"); 
	}

	public static void main(String[] args) {
		try {
			validate(17);
		} catch (Exception e) {
			System.out.println("Caught"+e);
			System.out.println("rest of the code...");  
		}
	}

}
