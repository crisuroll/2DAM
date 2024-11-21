package examen;

public class Arithmetic {
	private int a; 
	private int b;
	public Arithmetic(int a, int b){
		this.a = a; 
		this.b = b;
	}
	public int division() throws ExceptionDivisionByZero, ExceptionNegativeNumber {
		 if (this.a < 0 || this.b < 0)
			 throw new ExceptionNegativeNumber("Error: Negative number");
		 else if (this.b == 0)
			 throw new ExceptionDivisionByZero("Error: Division By Zero");
		 else return 
				 this.a / this.b;
	}
}