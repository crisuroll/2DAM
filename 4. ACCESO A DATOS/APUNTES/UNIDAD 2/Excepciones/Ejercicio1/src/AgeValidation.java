import java.util.Scanner;

public class AgeValidation {

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		try {
			checkAge(sc.nextInt());
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	
	public void checkAge(int _age) throws InvalidAgeException {
		if (_age >= 18 && _age <= 100) {
			System.out.println("La edad es válida.");
		} else {
			throw new InvalidAgeException("La edad no es válida.");
		}
	}
	
}
