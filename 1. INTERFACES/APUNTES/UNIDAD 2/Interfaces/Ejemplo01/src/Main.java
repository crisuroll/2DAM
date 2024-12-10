
public class Main {

	public static void main(String[] args) {
		// A a = new A(2);
		// A a = new A1(2);
		// No se puede instanciar un objeto de tipo A porque son clases abstractas y no puede haber un
		// tipo dinámico como clase abstracta
		A a = new A2(2,3); // Es correcto porque el tipo dinámico no es una clase abstracta
		a.increment();
		System.out.println(a.getX());
		// System.out.println(a.getY());
		// Cuando se ejecuta un método en presencia de herencia primero se mira si existe en la clase
		// estática o alguna de sus superclases. En el caso de que sí existiese, se va al tipo dinámico
		// y subiendo por el árbol de herencia ejecuta el primer getY() que encuentra.

	}

}
