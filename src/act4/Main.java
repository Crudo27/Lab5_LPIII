package act4;

public class Main{
	public static void main(String[] args)
	{
		Pila<String> pila1 = new Pila<>(5);
		Pila<String> pila2 = new Pila<>(5);
		Pila<String> pila3 = new Pila<>(5);

		pila1.push("A");
		pila1.push("B");
		pila1.push("C");

		pila2.push("A");
		pila2.push("B");
		pila2.push("C");

		pila3.push("A");
		pila3.push("C");
		pila3.push("B");

		System.out.println("pila1 es igual a pila2: " + pila1.esIgual(pila2));
		System.out.println("pila1 es igual a pila3: " + pila1.esIgual(pila3));
		System.out.println("Tope de pila1 despues de comparar: " + pila1.pop());
	}
}
