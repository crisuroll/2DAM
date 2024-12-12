import java.util.Scanner;

public class AgeValidation {
	
	public void main() throws InvalidAgeException {
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		checkAge(edad);
	}
	
	public void checkAge(int _edad) throws InvalidAgeException {
		if (_edad < 18 || _edad > 100) {
			throw new InvalidAgeException("Edad inválida.");
		} else {
			System.out.println("Edad válida.");
		}
	}
}
