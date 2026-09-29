package act2;

public class Main{
	public static void main(String[] args)
	{
		Pila<Integer> pila = new Pila<>(5);
		pila.push(10);
		pila.push(20);
		pila.push(30);
		pila.push(40);

		System.out.println("La pila contiene 30: " + pila.contains(30));
		System.out.println("La pila contiene 50: " + pila.contains(50));
		System.out.println("Elemento retirado despues de buscar: " + pila.pop());
	}
}
