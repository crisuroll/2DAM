package examen;

public class Main {

	 public static void main(String[] args){
		 Arithmetic a = new Arithmetic(-2,3);
		 try { 
			 int z = a.division();
			 System.out.println(z);
		 }
		 catch (ExceptionDivisionByZero e){
			 System.out.println(e.getMessage());
		 }
		 catch (ExceptionNegativeNumber e){
			 System.out.println(e.getMessage());
		 }
		 finally {
			 System.out.println("En último lugar entro aquí");
		 }
		 System.out.println("La ejecución sigue a partir de aquí");
		 }

}
